package practices.practice09;

import java.util.Scanner;

public class Q03_ForLoop_IsDigit {
    public static void main(String[] args) {
        /*

     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String");
        System.out.println(sumOfDigits((input.nextLine())));

    }
    public  static int sumOfDigits(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
           if (Character.isDigit(str.charAt(i))){
               sum +=Integer.parseInt(str.charAt(i)+"");
            }
        }
        return sum;
    }
}
