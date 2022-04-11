package pocaop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SomeTarget {

    public SomeTarget()
    {
        System.out.println("object created");
    }

    public void testDB()
    {
        System.out.println("db action at work");
    }

    public void nonDB()
    {
        System.out.println("non  action");
    }
}
