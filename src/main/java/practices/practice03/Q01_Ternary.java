package practices.practice03;

public class Q01_Ternary {
    public static void main(String[] args) {
        //Type code to check if a number is positive or not

        //Way 1:
        int x = -23;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        //Way 2:
        String result = x > 0 ? "Positive" : "Negative";
        System.out.println(result);

        //Type code to check if an integer has 3 digits or not==>Boundary Value Analysis-->-1000,-999,100,-99,0,99,999
        int y = -999;
        int absY=Math.abs(y);
        String result2=absY>99 &&absY<1000 ? "It has 3 digits" : "It does not have 3 digits";
        System.out.println(result2);
    }
}
