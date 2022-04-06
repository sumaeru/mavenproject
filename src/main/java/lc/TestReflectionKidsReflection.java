package lc;

import java.lang.reflect.Method;

//spring framework
public class TestReflectionKidsReflection {

    public static void main(String[] args) {

        // assume I cannot see the contents of class X.
        X obj=new X();

        //show the X class to the mirror.
        Class c =   obj.getClass() ; //X.class;
        try {
            Method m = c.getDeclaredMethod("junk");
            System.out.println("junk method found");
        } catch (NoSuchMethodException e) {
            System.out.println("Junk Method not found");
        }


    }
}
