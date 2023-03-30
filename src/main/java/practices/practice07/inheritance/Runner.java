package practices.practice07.inheritance;

public class Runner {
    ////Create a method that calculates the area of the circle (use inheritance for math operations)
    public static void main(String[] args) {
        areaOfCircle(3);

    }
    public static void areaOfCircle(int radius){
        Circle circle=new Circle();

        System.out.println(circle.multiply(circle.numberOfPi, circle.findSquare(radius)));//28.26
    }
}
