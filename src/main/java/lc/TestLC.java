package lc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLC {

    public static void main(String[] args) {

        ApplicationContext c =new ClassPathXmlApplicationContext("carrot.xml");
        System.out.println("it is working");
        AddressBook addressBook=c.getBean(AddressBook.class);
        addressBook.arrangeAddresses();


    }
}
