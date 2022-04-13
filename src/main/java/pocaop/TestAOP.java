package pocaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("pocaop")
public class TestAOP {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestAOP.class);
        SomeTarget someTarget = applicationContext.getBean(SomeTarget.class);
        someTarget.testSomething();
        someTarget.nonDB();
        /*
        SomeTarget someTarget =new SomeTarget();
        SomeAspect someAspect =new SomeAspect();

         */




    }
}
