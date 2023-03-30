package ssg.varargs;

public class Varargs02 {

    public static void main(String[] args) {
        System.out.println(sumVarargs(4,5,7));

    }
    public static int sumVarargs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    //Create a method called sumVarargs that accepts a variable number of integer arguments and returns the sum of all the integers.
   // Test the method by calling it with different numbers of arguments.
}
