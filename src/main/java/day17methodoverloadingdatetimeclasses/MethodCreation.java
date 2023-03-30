package day17methodoverloadingdatetimeclasses;

public class MethodCreation {
    public static void main(String[] args) {
        //Actual values used in method parenthesis are called "arguments"
      int r1=  addTwoInt(3,5);
        System.out.println(r1);//8

        String r2= getFirstLastChar("Ajda");
        System.out.println(r2);//Aa

        int r3=getSumOfAsciisOfAllChars("Ajda");
        System.out.println(r3);//368

    }
    //Example 1: Create a method adds two integers
    //Variables used in method parenthesis are called "parameters"
    public  static int addTwoInt(int a, int b){
       return a+b;
    }
    //Example 2: Create a method prints teh first and the last character of a String on the console
    public static String getFirstLastChar(String s){
      String result=""+  s.charAt(0)+s.charAt(s.length()-1);
      //if you are not putting + between char()methods its will give the sum of  ascii values but we dont want  sum of
        // the ascii values we want first and last char that is the reason we are putting  "".
      return result;
    }
    //Example 3:Create a method prints the sum of the ASCII values of characters in a String


    public static int getSumOfAsciisOfAllChars(String s){
        int sumOfAsciis=0;
        for(int i=0; i<s.length();i++){
           sumOfAsciis= sumOfAsciis + s.charAt(i);
        }
        return sumOfAsciis;
    }
}
