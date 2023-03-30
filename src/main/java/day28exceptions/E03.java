package day28exceptions;

public class E03 {
    /*
    1)"finally block" is used to execute some codes under every condition
    2)"finally block" can be used with "try -catch" or just "try"
    3)"try block" cannot be used alone
       "try block" can be used 1) with a single catch 2) with multiple catches 3) with a single catch and finally
                               4) with a multiple catches and finally 5) with just a finally
    4)"finally block" can be used just once

    Interview Question: Can you explain "final", "finally" and "finalize" keywords?
                    -  "final" we learned it before()"final" methods must have "constant method body" but in abstraction every child class will use the "abstract method"
      with a different body.Because of that, Java does not let you make an abstract method "final"
      I mean "public  final abstract void drink()" gives error.An "abstract class" cannot be "final"because "final" class cannot have "child classes" but abstract class
      should have child classes to make "abstract method"s to be implemented in child classes
                     - "finally" we learned it on the top
                     - "finalize" is a process Java does before throwing unused things from memory to trash

    final - must be initialized
     */
    public static void main(String[] args) {
        System.out.println(divide(6,2));
        System.out.println(divide(6,0));

    }
    //Example 1:Create a method to do division
    //          The method should print "The mission is completed" even Exception thrown or not
    public  static int divide(int a , int b) {
        int result = 0;

        try {
            result = a / b;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            {
                System.out.println("The mission is completed");
            }
            return result;

        }
    }
}
