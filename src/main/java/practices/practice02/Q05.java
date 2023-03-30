package practices.practice02;

public class Q05 {
    public static void main(String[] args) {
        /*
        //1.Task: Count the alphabetical charaters in a given value.
         */
        String str = "Wow!...Ali is 13 years old and he is a university student!!!";
        int totalNumOfChars=str.length();
        System.out.println(totalNumOfChars);
       String strWithoutPunct = str.replaceAll("\\p{Punct}","");
        System.out.println(strWithoutPunct);
       String strWithoutDigitsAndPunct= str.replaceAll("[^a-zA-Z]", "");
        System.out.println(strWithoutDigitsAndPunct.length());//41
        System.out.println(totalNumOfChars - strWithoutDigitsAndPunct.length());//19
    }
}
