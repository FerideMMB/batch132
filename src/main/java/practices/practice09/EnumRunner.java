package practices.practice09;

import java.util.Arrays;

public class EnumRunner {
    //Write a code that includes vegetable and fruit recommendations by month and tells you the total hours of exercise to be done.
    // Print the months of exercise over 20 hours on the screen.
    public static void main(String[] args) {
        System.out.println("Nurtrition exersice January vegetable:" +NutritionExercise.January.vegetableOfMonth);//Nurtrition exersice January vegetable:Carrot
        System.out.println(NutritionExercise.valueOf("March").hourOfExercise);//19
        System.out.println(Arrays.toString(NutritionExercise.values()));//January, February, March, April, May, June, July, August, September, October, November, December]
        System.out.println(NutritionExercise.values()[5].hourOfExercise);//27

        for (NutritionExercise w:NutritionExercise.values()){
            if(w.hourOfExercise>20){
                System.out.println(w+"->"+w.hourOfExercise);
                System.out.println(w.hourOfExercise);
            }

        }

    }
}
