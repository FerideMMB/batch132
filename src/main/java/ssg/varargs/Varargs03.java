package ssg.varargs;

public class Varargs03 {
    public static void main(String[] args) {
        System.out.println(concatVarargs("Hey,", " John", " how", " are"," you?"));

    }public static String concatVarargs(String ... str){

        String concatResult = "";
        for(String w: str){
            concatResult = concatResult + w;

        }

        return concatResult;
    }

    //Exercise 4: Create a method called concatenateStrings that accepts a variable number of String arguments and returns
    // a single String containing all the arguments
   // concatenated together. Test the method by calling it with different numbers of arguments.
}
