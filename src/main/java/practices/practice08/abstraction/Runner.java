package practices.practice08.abstraction;

public class Runner {
    public static void main(String[] args) {

        //Type code to calculate are of rectangle and triangle.(Use abstraction)
        Triangle triangle = new Triangle();
        System.out.println(triangle.calculateArea(5,4));//10.0
        System.out.println(triangle.calculateArea(3,2));//3.0

      //  System.out.println( new Rectangle().calculateArea(5,6));//30.0
        //If you create a new object like that  "new Rectangle()" you can use just once it is NOT RECOMMENDED


        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle.calculateArea(10,5));//50.0
        System.out.println(rectangle.calculateArea(3,6));//18
    }
}

