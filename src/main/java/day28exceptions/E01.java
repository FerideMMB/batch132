package day28exceptions;

public class E01 {
    /*
    1)To handle  multiple Exceptions you can use "multiple catch blocks" or "single catch block"
    2)If you prefer to use single catch block use "Exception" in "catch parenthesis"
    3)When you use multiple catch blocks the order of the catch blocks is not important if and only if the Exception
    classes do not have parent child relationship among them.
    If there is parent child relationship among them the child must be used first.
     */
    public static void main(String[] args) {


        String s1="240";
        System.out.println( divideByNumOfChars(s1));
        String s2=null;
        System.out.println( divideByNumOfChars(s2));//NullPointerException
        String s3="2a4b0c";
        System.out.println( divideByNumOfChars(s3));//NumberFormatException: For input string: "2a4b0c"
        String s4="2";
        System.out.println( divideByNumOfChars(s4));//ArithmeticException: / by zero

        System.out.println("========================");

        String s5="240";
        System.out.println( divideByNumOfChar(s5));
        String s6=null;
        System.out.println( divideByNumOfChar(s6));//NullPointerException
        String s7="2a4b0c";
        System.out.println( divideByNumOfChar(s7));//NumberFormatException: For input string: "2a4b0c"
        String s8="2";
        System.out.println( divideByNumOfChar(s8));//ArithmeticException: / by zero


    }
    public static int divideByNumOfChars(String s) {
        //Example 1: Create a method divides an integer converted from a String by 1 less than the number of characters of the String
        //          String s ="240"; ==>240/3 =80
        //1.Way : How to handle multiple Exceptions by using multiple catch blocks
        int result = 0;
        try {
            int numOfChars = s.length();//((number of characters))//NullPointerException is possible
            int num = Integer.valueOf(s);//(converted string to integer)//NumberFormatException is possible
            result = num / (numOfChars - 1);//ArithmeticException is possible
        } catch (NullPointerException e) {
            System.out.println("Most probably the String is null -" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Most probably the String contains non-digit characters- " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Most probably divisor is zero -" + e.getMessage());
        }
        return result;
    }

        ////2.Way : How to handle multiple Exceptions by using just a single catch blocks
    public static  int divideByNumOfChar(String s) {
        int result = 0;
        try {
            int numOfChars = s.length();//NullPointerException is possible
            int num = Integer.valueOf(s);//NumberFormatException is possible
            result = num / (numOfChars - 1);//ArithmeticException is possible

        } catch (Exception e) {
            System.out.println("An Exception occurred- " + e.getMessage());
        }
        return result;


    }

    //3.Way : How to handle multiple Exceptions by using Exception and any other
    public static  int divideByNumOfCh(String s) {
        int result = 0;
        try {
            int numOfChars = s.length();//NullPointerException is possible
            int num = Integer.valueOf(s);//NumberFormatException is possible
            result = num / (numOfChars - 1);//ArithmeticException is possible

        }catch (ArithmeticException e){
            System.out.println("Most probably divisor is zero -"+ e.getMessage());
        }
        catch (Exception e) {
            System.out.println("An Exception occured- " + e.getMessage());
        }
        return result;


    }
}
