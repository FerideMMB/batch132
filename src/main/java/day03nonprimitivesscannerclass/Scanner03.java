package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ask user  to enter width and length of a rectangle, then calculate
        //perimeter and the area of the rectangle.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter width and length of the ractangle, please...");
       double width = input.nextDouble();
       double length = input.nextDouble();
        System.out.println("Perimeter:"+(2*width+2*length));
        System.out.println("Area:"+(width*length));
    }
}
