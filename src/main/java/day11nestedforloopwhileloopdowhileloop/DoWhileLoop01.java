package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //Example 1: What is the difference between "while" and "do while" loops?

        //while-loop: Zero execution is possible
        int i=1;
        while(i<1){ //think first
            System.out.println("I am while loop");// action
            i++;                                  // second
        }

        //do-while loop: zero execution is impossible, loop body will be executed at least once.
        int k =1;
        do{
            System.out.println("I am do-while loop"); // action
            k++;                                      // first
        }while(k<1); //think second


        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise, tell user "Lost!"

         */
        //If you need something to repeat you need to put in loop body that is the reason we put sout in the loop body

        Scanner input = new Scanner(System.in);


         do{
             System.out.println("Enter an integer to play ...");
             int num = input.nextInt();

             if(num<100){
                 System.out.println("You won!");
             }else{
                 System.out.println("You lost!");
                 break;
             }
         }while(true);


    }
}
