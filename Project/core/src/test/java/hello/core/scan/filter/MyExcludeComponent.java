package hello.core.scan.filter;

import java.lang.annotation.*;

// @Component에 있는것 가져옴
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {

}
