package practices.practice07;

import java.util.Scanner;

public class Q02_DoWhile_NumberGuessGame {
    public static void main(String[] args) {


    /*
    Type a number guess game:
    Hint: Ask user to enter a number between 0-100
          Type a code that gives a random number between 0-100
          If the number is less than random number print: "Enter a greater number"
          If the number is more than random number print: "Enter a smaller number"
          If the number is equal to random number print: "Congratulations! You found the number!!!"
     */
        Scanner  scanner= new Scanner(System.in);
        System.out.println("Enter an integer between 0-100");
        int number;
        int randomNumber =((int)(Math.random()*101));
        int counter =0;
        do{
            counter++;
           number = scanner.nextInt();
            if(number<randomNumber){
                System.out.println("You failed! You have"+(10-counter)+"guesses more.Enter a greater number");

            } else if (number>randomNumber) {
                System.out.println("You failed! You have"+(10-counter)+"guesses more.Enter smaller number");

            }else{
                System.out.println("Congratulations!You found the number"+counter+"guess!!!");
                System.out.println("Your point is "+(11-counter)*10);//we are  using 11 because  if we win in our guess we shoule have 100 point
                // if you do 10  and we  win in our  first guess our output will be 90
            }
            if(counter==10){
                System.out.println("Game Over!!IF you want to play again anter 1 otherwise enter any other number");
                int decision= scanner.nextInt();
                if(decision==1){
                    counter=0;
                    randomNumber=(int)(Math.random()*101);
                    System.out.println("Enter  an integer between 0-100");
                }
                break;
            }

        }while(number!=randomNumber);
        System.out.println("Bye bye!!!");


    }
}

