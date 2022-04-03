package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    // private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    // private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    // -> DIP, OCP 위반됨 구현이 아닌 interface에만 의존하게 해야함.

    // final은 무조건 값이 할당 되어야 함으로 지운다. -> 근데 이러면 NPE가 발생함.
    // -> 해결하려면 누군가 클라이언트인 OrderServiceImpl에 DiscountPlicy의 객체를 대신 생성하고 주입 해주어야 한다.
    private DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        // Order 입장에서는 discountPolicy몰라 니가 알아서 해줘 : 잘 설계가 된 것
        int discountPrice = discountPolicy.discount(member, itemPrice);
        
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
