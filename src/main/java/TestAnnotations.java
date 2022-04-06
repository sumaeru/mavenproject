package ris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pleasespringlookhere.P;
import x.Cooking;


public class TestAnnotations {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cooking.class);
        P p =applicationContext.getBean(P.class);
        p.someNonStaticFunction();

    }

}
