package day32lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
         List<String> names= new  ArrayList<>();
         names.add("Tom");
         names.add("Alex");
         names.add("Jim");
         names.add("Michael");
         names.add("Mary");
         names.add("Alexander");
         names.add("Alex");
         printSortedUpperUnique(names);//ALEX ALEXANDER JIM MARY MICHAEL TOM
        System.out.println();
        printUpperUniqueSortWithLength(names);//TOM JIM ALEX MARY MICHAEL ALEXANDER
        System.out.println();
        printUpperUniqueSortWithLastChar(names);//MICHAEL TOM JIM ALEXANDER ALEX MARY
        System.out.println();
        printSortedByLengthThenFirstChar(names);//Jim Tom Alex Alex Mary Michael Alexander
        System.out.println();
        printSquaresOfLengthDinstinctlyReverseOrder(names);//81 49 16 9
        System.out.println();
        System.out.println(checkLengthsToBeLessThanTwelve(names));//true
        System.out.println();
        System.out.println( checkInitialsNotBeX(names));//true
        System.out.println(checkLastCharToBeLowerCaseR(names));//true
    }
    //1)Print the list elements on the console in natural order,with upper cases, and un-repeatedly
    public  static void printSortedUpperUnique(List<String> names){
        names.stream().distinct().sorted().map(t->t.toUpperCase()).forEach(t-> System.out.print(t+" "));//ALEX ALEXANDER JIM MARY MICHAEL TOM

    }
    //2)Print the list elements on the console by ordering them according to their lengths,with upper cases, and un-repeatedly
    public static void printUpperUniqueSortWithLength(List<String> names){
        names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printInTheSameLineWithSpace);;//
    }
    //3)Print the list elements on the console by ordering them according to their last characters, with upper cases, and un-repeatedly
    public static void printUpperUniqueSortWithLastChar(List<String> names) {
        names.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.charAt(t.length()-1))).forEach(t -> System.out.print(t + " "));
    }
    //4)Create a methods to sort the  elements  according to their lengths then according to their first characters
    //TOM JIM ALEX ALEX MARY MICHAEL ALEXANDER==>JIM TOM ALEX ALEX MARY MICHAEL ALEXANDER
    public static void printSortedByLengthThenFirstChar(List<String> names){
        names.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(Utils::printInTheSameLineWithSpace);//Jim Tom Alex Alex Mary Michael Alexander
    //If a method needs parameter it cannot be used in "Method Reference"
    }
    //5)Create a method which takes the square of the length of every element, prints them distinctly in reverse order
    public static void printSquaresOfLengthDinstinctlyReverseOrder(List<String> names){
        names.
                stream().//         Alex Alex  Jim Tom Michael Mary Alexander
                map(String::length).//4   4      3   3     7     4     9
                distinct().//3     7     4     9
                map(Utils::getSquare).//9    49   16   81
                sorted(Comparator.reverseOrder()).// 81   49  16   9
                forEach(Utils::printInTheSameLineWithSpace);
    }
     //6)Create a method to check if the lengths of all elements are less than 12
    public  static boolean checkLengthsToBeLessThanTwelve(List<String> names){
      return   names.stream().allMatch(t->t.length()<12);
    }
    //7)Create a method to check if the initial of any element is not 'X'
    public static boolean checkInitialsNotBeX(List<String> names){
      return   names.stream().noneMatch(t->t.startsWith("X"));

    }
    //8)Create a method to check if at least one of the elements ending with "r"
    public static boolean checkLastCharToBeLowerCaseR(List<String> names){
      return   names.stream().anyMatch(t->t.endsWith("r"));

    }
}
