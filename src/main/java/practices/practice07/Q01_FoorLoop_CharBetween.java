package practices.practice07;

import java.util.Scanner;

public class Q01_FoorLoop_CharBetween {
    /*
    //Example 1:Ask user to enter 2 chars and print on console the chars between them.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        System.out.println("Enter first char");
       char char1= input.next().charAt(0);
         System.out.println("Enter second char");
       char char2= input.next().charAt(0);

       int ch1=Math.min(char1,char2);//this method is to convert to put smallest number first and after that largest number
       int ch2=Math.max(char1,char2);

        for(int i=ch1;i<=ch2;i++){
            System.out.print((char)i+" ");//if I put  just "i" I will get numbers , when I put "char" infront I will get the character

        }

    }
}
