package practices.practice02;

public class Q04 {
    public static void main(String[] args) {
        /*
        Create a String variable and find  the sum ASCII values of the first and the last characters of the String.
        String s = "Miami";
         */
        String s = "Miami";
        int indexOfLAstChar=s.length()-1;
        int AsciiFirst =s.charAt(0);
        int AsciiLast=s.charAt(indexOfLAstChar);
        System.out.println("Total ASCII values of first and last characters:"+ (AsciiFirst + AsciiLast));

    }
}
