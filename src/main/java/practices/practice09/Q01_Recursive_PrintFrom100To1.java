package practices.practice09;

public class Q01_Recursive_PrintFrom100To1 {
    public static void main(String[] args) {
        printNumbers('d');


        // Create a method that prints numbers from 100 to 1 without using loops and numbers.

    }
    public static void printNumbers(char ch){
        if(ch>='a'/'a'){
            System.out.print((int)ch+" ");
            ch--;
            printNumbers(ch);

        }

    }
}

