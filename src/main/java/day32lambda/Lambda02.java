package day32lambda;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        System.out.println(getSum(7, 100));//5029
        System.out.println(getMultiplication(2, 11));//39916800
        System.out.println(getFactorial(5));//120
        System.out.println(sumOfEvensBetweenTwoIntegers(3, 10));//28
        System.out.println(sumOfDigitsOfIntegersInTheGivenRange(45, 47));//30

    }
    //1)Create a method to find the sum of integers from 7 to 100

    public static int getSum(int starting, int ending) {
        //  return IntStream.rangeClosed(7,100).sum();//when we need to add number with next number; our code is not working when our starting value is higher than ending value
        if (starting > ending) {
            int temp = starting;
            starting = ending;
            ending = temp;
        }
        return IntStream.rangeClosed(starting, ending).sum();
    }

    ////2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int getMultiplication(int starting, int ending) {
        if (starting > ending) {
            int temp = starting;
            starting = ending;
            ending = temp;
        }
        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();

    }

    //3)Create a method to calculate the factorial of a given number.(5! =1*2*3*4*5)
    public static int getFactorial(int number) {
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            number = Math.abs(number);

        }
        return IntStream.rangeClosed(1, number).reduce(Math::multiplyExact).getAsInt();

    }

    //4)Create a method to calculate the sum of even integers between given two integers
    public static int sumOfEvensBetweenTwoIntegers(int starting, int ending) {
        if (starting > ending) {
            int temp = starting;
            starting = ending;
            ending = temp;


        }
        return IntStream.rangeClosed(starting, ending).filter(t -> t % 2 == 0).sum();
    }


    //5)Create a method to calculate the sum of digits of every integers between given two integers
    public static int sumOfDigitsOfIntegersInTheGivenRange(int starting, int ending) {

        return IntStream.rangeClosed(starting, ending).map(Utils::getSumOfDigits).sum();
    }
}
