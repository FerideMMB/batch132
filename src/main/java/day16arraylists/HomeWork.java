package day16arraylists;

public class HomeWork {
    public static void main(String[] args) {
        int sum = numbers(8, 9);
        System.out.println(sum);//17

        String ch = firstAndLastChar("Elisa");
        System.out.println(ch); // First character: E Last character: a

        String sum1 = aSCIIValues("Batu");
        System.out.println(sum1);//396

    }
    // Create a method adds two integers
    public static int numbers(int a, int b) {
        return a + b;
    }

    // Create a method prints the first and the last character on the console
    public static String firstAndLastChar(String name) {
        return "First character: " + name.charAt(0) + " " + "Last character: " + name.charAt(name.length() - 1);
    }

    // Create a method prints the sum of the ASCII values of characters in a String

    public static String aSCIIValues(String name) {
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            sum = sum + name.charAt(i);
        }
        return String.valueOf(sum);

    }
}





