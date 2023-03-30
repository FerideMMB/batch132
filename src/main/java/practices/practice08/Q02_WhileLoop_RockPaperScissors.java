package practices.practice08;

import java.util.Random;
import java.util.Scanner;

public class Q02_WhileLoop_RockPaperScissors {

        /*
    Type a Rock Paper Scissors game
    -Take a guess from user
    -Take a guess from computer
    -Compare guesses
    -Who reaches 3 first wins
    -Who wins by 3-0 gets Golden Score
    -Who wins by 3-1 gets Silver Score
    -Who wins by 3-2 gets Bronze Score
    */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int playerScore = 0;
            int computerScore = 0;
            int counter = 0;

            while (playerScore < 3 && computerScore < 3) {//Who reaches 3 first wins
                counter++;
                System.out.println("Enter your " + counter + ". decision:\nRock\nPaper\nScissors");//Take a guess from user
                String playerDecision = scanner.next().trim().toLowerCase();
                if (!(playerDecision.equals("rock") || playerDecision.equals("paper") || playerDecision.equals("scissors"))) {
                    System.out.println("Enter a valid decision");
                    counter--;
                    continue;
                }

                //Take a guess from computer
                String[] rockPaperScissorsOptions = {"rock", "paper", "scissors"};
                int randomIndex = (int) (Math.random() * 3);//0,1,2
                String computerDecision = rockPaperScissorsOptions[randomIndex];
                System.out.println("computerDecision = " + computerDecision);

                //Compare guesses
                if (playerDecision.equals(computerDecision)) {
                    System.out.println("Draw! Score: " + playerScore + " <==> " + computerScore);
                } else if (playerDecision.equals("rock") && computerDecision.equals("scissors") || playerDecision.equals("paper") && computerDecision.equals("rock") || playerDecision.equals("scissors") && computerDecision.equals("paper")) {
                    playerScore++;
                    System.out.println("You win! Score: " + playerScore + " <==> " + computerScore);
                } else {
                    computerScore++;
                    System.out.println("Computer wins! Score: " + playerScore + " <==> " + computerScore);
                }
            }

            System.out.println("==Game Over==");

            String score;
            if (playerScore == 3) {
                if (computerScore == 0) {//Who wins by 3-0 gets Golden Score
                    score = "Golden";
                } else if (computerScore == 1) {//Who wins by 3-1 gets Silver Score
                    score = "Silver";
                } else {
                    score = "Bronze";//Who wins by 3-2 gets Bronze Score
                }
                System.out.println("You win with " + score + " score! Congratulations!!!");
            } else {
                if (playerScore == 0) {
                    score = "Golden";
                } else if (playerScore == 1) {
                    score = "Silver";
                } else {
                    score = "Bronze";
                }
                System.out.println("Computer wins with " + score + " score!");
            }
        }
    }