package day31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /*
    1)We learned "Structure Programming" so far,in "Structure Programming"  structure is very important, we spend time on structure
    2)Lambda is "Functional Programming", in "Functional Programming" we will focus on just the functions(methods)
    3)"t->code" is called "Lambda Expression".
    In "Functional Programming" we may use "Lambda Expression"s, it is not recommended.
    We will prefer to use "Method Reference", we will learn it in the next sessions
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfUniqueOddElements(nums);
        System.out.println();
        System.out.println(findSumOfSquareOfEvenElements(nums));//456
        System.out.println();
        System.out.println(calculateMultiplicationOfSquareOfEvenElements(nums));//45158400
        System.out.println(findMax(nums));//131
        System.out.println(findMin(nums));//4
        System.out.println(findMinGreaterThanSevenEven(nums));//10
        System.out.println();
        System.out.print(findAnyValueLessThanFifteenEven(nums));//12
    }
    //1)Create a method to print all list elements on the console in the same line with a space among them

    //1.Way Used "Structured Programming"
    public static void printElements1(List<Integer>myList){
        for(Integer w:myList){
            System.out.print(w+ " ");//12 9 131 14 9 10 4 12 15


        }

    }
    //2.Way:Used "Functional Programming"
    public static void printElements2(List<Integer>myList){
        myList.stream().forEach(t-> System.out.print(t+ " "));//12 9 131 14 9 10 4 12 15
    }
    //2)Create a method to print the "even" list elements on the console
//  in the same line with a space between two consecutive elements.(Structured)
    //1.Way Used "Structured Programming"
    public static void printEvenElements1(List<Integer> myList) {
        for (Integer w : myList) {
            if (w % 2 == 0) {
                System.out.print(w + " ");//12 14 10 4 12
            }
        }
    }
        //2.Way:Used "Functional Programming"
        public static void printEvenElements2 (List<Integer> myList) {
            myList.
                    stream().
                    filter(t -> t % 2 == 0).
                    forEach(t -> System.out.print(t + " "));//12 14 10 4 12
        }
    //3)Create a method to print the square of odd list elements on the console
     // in the same line with a space between two consecutive elements.
    public  static  void printSquareOfOddElements(List<Integer>myList){
        myList.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));//81 17161 81 225

    }
    public static void printCubeOfUniqueOddElements(List<Integer>myList){
        myList.
                stream().
                filter(t->t%2!=0).
                distinct().
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));//729 2248091 3375
    }
    ////5)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public  static  int  findSumOfSquareOfEvenElements(List<Integer>myList){
        return myList.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).reduce(0,(t,u)->t+u);//456
    }
    //6)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    public static  int calculateMultiplicationOfSquareOfEvenElements(List<Integer>myList){
        return myList.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(1,(t,u)->t*u);
    }
    ////7)Create a method to find the "maximum value" from the list elements
    //1.Way
    public static int findMax(List<Integer>myList){
      return   myList.
              stream().
              distinct().
              reduce(Integer.MIN_VALUE,(t,u)->t>u? t:u);//131
    }
    //2.Way
    public static int findMax2(List<Integer>myList) {
        return myList.
                stream().
                distinct().
                reduce(myList.get(0), (t, u) -> t > u ? t : u);//131
    }
    //3.Way
    public static int findMax3(List<Integer>myList) {
        return myList.
                stream().
                distinct().
                sorted().reduce((t,u)->u).get();//reduce() method with a single parameter does not return Integer
                                                // To make return type Integer use get () method
    }
    //4.Way
    public static int findMax4(List<Integer>myList) {
        return myList.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                findFirst().get();

    }
    ////8)Create a method to find the "minimum value" from the list elements
    //1.Way
    public static int findMin(List<Integer>myList){
      return   myList.
              stream().
              distinct().
              reduce(Integer.MAX_VALUE,(t,u)->t<u? t:u);//4
    }
    //2.Way
    public static int findMin2(List<Integer>myList){
        return   myList.
                stream().
                distinct().
                reduce(myList.get(0),(t,u)->t<u? t:u);//4
    }//3.Way
    public static int findMin3(List<Integer>myList){
        return   myList.
                stream().
                distinct().
                sorted().
                findFirst().get();
    }
    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static int findMinGreaterThanSevenEven(List<Integer>myList){
       return myList.stream().distinct().filter(t->t>7 && t%2==0).sorted().findFirst().get();

    }
    //10)Create a method to find any value which is greater than 15 and even from the list
    public static int findAnyValueLessThanFifteenEven(List<Integer>myList){
       return myList.stream().distinct().filter(t->t<15 &&t%2==0).findAny().get();
    }
    }


