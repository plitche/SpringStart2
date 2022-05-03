# SpringStart2 - Inflearn

3.객체지향 설계와 스프링 - 좋은 객체 지향 프로그래밍이란?
  1) 추상화
  2) 캡슐화
  3) 상속
  4) 다형성(Polymorphism)

8.스프링 핵심 원리 이해1 - 예제 만들기 - 회원 도메인 개발  
  - private final MemberRepository memberRepository = new MemoryMemberRepository();  
  위와 같이 MemberRepository 타입으로 초기화 하는데, 그럼 왜  
  - private final MemoryMemberRepository memoryMemberRepository = new MemoryMemberRepository();  
  이렇게 하면 안되는 걸까?  
  
11.스프링 핵심 원리 이해1 - 예제 만들기 - 주문과 할인 도메인 개발
  * F2 오류가 난 곳으로 이동한다.
  * Ctrl + Alt + T : create test case

12. 스프링 빈이 필요한 이유
  * 클라이언트가 요청할 때마다 객체/인스턴스를 생성하여 반환하면 힙 메모리의 부하가 크다. 때문에 싱글톤 패턴을 이용해야 하는데 스프링 컨테이너를 통해서 편하게 관리할 수 있다.
