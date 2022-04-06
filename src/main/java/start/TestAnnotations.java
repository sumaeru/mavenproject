package start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import searchhere.A;
import searchthere.B;

@ComponentScan("searchhere,searchthere")
public class TestAnnotations {

    public static void main(String[] args) {



        ApplicationContext ac = new AnnotationConfigApplicationContext(TestAnnotations.class);
        A a = ac.getBean(A.class);
        a.f1();



    }

}
