package practices.practice02;

import java.util.Scanner;

public class Q02 {
    /*
    Modulus operator  ==> in Java is called modulus operator
    It returns the "remainder" in a division operation
    13/5==> 13%5==>3
     */
    public static void main(String[] args) {
        //Ask user to enter an integer then print "Even" on the console if the number is even.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        boolean checkedNum = number%2==0;
        System.out.println("Is the number even?"+(number%2==0));

        Scanner input2= new Scanner(System.in);
        System.out.println("Enter a digit to check if it is an odd number");
        int checkOdd = input2.nextInt();
        System.out.println("Is the number  odd?" + (checkOdd%2 !=0));
    }
}
