package pleasespringlookhere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class P {

    @Autowired
    private String s;


    public void someNonStaticFunction() {

        System.out.println(s != null  ? " not null "+s : "null ");
    }
}
