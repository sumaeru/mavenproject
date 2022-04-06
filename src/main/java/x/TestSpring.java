package x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args)
    {

        ApplicationContext c =new ClassPathXmlApplicationContext("carrot.xml");
        Y y = c.getBean("obj3",Y.class);// asking for trouble I will get it.

        /*
        P p =new P();
        System.out.println(123);
         ABC abc = c.getBean(ABC.class);//hey spring give me the object by telling the class name



        ABC def = c.getBean(ABC.class);
        //in all the 3 cases abc, temp, def we have same object only

        System.out.println( abc == def ? "same " : "not same");



        abc.ritual();

*/

    }


}
