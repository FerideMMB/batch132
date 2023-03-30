package day02typecasting_scanner;

public class WrapperClass01 {
    public static void main(String[] args) {

        /*
        Wrapper Class
        Non-primitive data types have "methods"together with the values.
        We can do many actions by using methods which is very useful.
        But primitives do not have any "methods" because of that we can not do any actions/use methods with primitives.
        Java created "Wrapper Classes"to handle this issue. Java created a new structure which has "primitive value" and "methods" together. This is called "Wrapper Classes"

        Wrapper Classes are Non - Primitive data types.

        Primitive Data:              Wrapper Class
        byte                          Byte
        short                         Short
        int                           Integer
        long                          Long
        float                         Float
        double                        Double
        char                          Char
        boolean                       Boolean
         */
        int age=12; //There is no method.
        Integer number= 333;// There are many useful methods

        System.out.println(number);

        char c= 'A';
        Character d= 'A';

        //Autoboxing
        byte b=23;
        Byte wb=b;

        //Unboxing: To convert "wrapper class object" into its primitive
        Short ws= 34;
        short s= ws;



    }
}
