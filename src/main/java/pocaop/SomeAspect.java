package pocaop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class SomeAspect {


    public SomeAspect()
    {
        System.out.println("object created");
    }


     @Before("execution(* testDB())")
     public void action1()
    {
        System.out.println("begin transaction");
    }

    @After("execution(* testDB())")
    public void action2()
    {
        System.out.println("end transaction");
    }

}
