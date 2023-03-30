package practices.practice01;

import java.util.Arrays;

public class Q03 {
    /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
       Calculate the average of these numbers.
     */
    public static void main(String[] args) {
        double num1 = 23.4, num2 = 24.0, num3 = 12, num4 = 450.3, num5 = 23000;
        double sum = num1+ num2+ num3+ num4+num5;
        System.out.println("sum" +sum);
        double average = sum/5;
        System.out.println("Average = " + average);

    }

}
