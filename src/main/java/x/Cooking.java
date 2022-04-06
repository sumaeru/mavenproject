package x;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("pleasespringlookhere")
public class Cooking {

    @Bean
    public String f1()
    {
        return "hey spring take this";

    }
}
