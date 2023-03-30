package ssg.varargs;

public class Varargs {
    /*
    Variable Arguments(Varargs) in java is a method that takes a variable number of arguments
    when we need to declare varargs we should put 3 dots after data type
    Example : public int add(int...nums){
    return a+b+c;}
    If there is another parameter with a variable length parameter, we should  put varargs  in teh end because
    other way it is will be unreachable
    We cannot declare two varargs in one object.

     */
    public static void main(String[] args) {
        //Create a method called printVarargs that accepts a variable number of arguments of int and prints each
        //argument on a new line. Test the method by calling it with various arguments .
        printVarargs(4,5,6,7,8);

    }
    public static void printVarargs(int...nums){
        for (int i:nums){
            System.out.println(i);
        }
    }
}
