package day07ifstatementternarystatement;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1 : Type code to check if a number is even or not by using ternary
        int num = 7;

        //Way 1 :Use if-else

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //Way 2 : Ternary
        //    Condition   ?   The code will be executed          : The code will be executed
        //                     for true condition                   for false condition

        String result = num%2==0   ?      "Even"                 : "Odd";
        System.out.println(result);


        //Example 2 : Type code to check if a number has 3 digits or not, use ternary

        int n = 523;

       String r = n>99&&n<1000 ? "It has 3 digits" : "IT has no 3 digits";
        System.out.println(r);

    }
}

