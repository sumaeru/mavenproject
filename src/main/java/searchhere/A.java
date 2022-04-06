package searchhere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import searchthere.B;

@Component
public class A {

    public A()
    {
        System.out.println("A object created");
    }


    @Autowired
    private B obj;


    @Autowired
    public void freak(B obj)
    {

    }

    public void f1()
    {
        System.out.println(obj != null  ? "not null ": "null ");
    }




}
