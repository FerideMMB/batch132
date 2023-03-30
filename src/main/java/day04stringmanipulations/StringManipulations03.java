package day04stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example 1 : Check th password if it has given rules.
        //            i) It should start with "J"
        //            ii) It should have at least 8 characters
        //            iii) LAst 3 characters should be "AVA"
        String pwd = "J12!?AVA";

        //            i) It should start with "J"
       boolean first = pwd.startsWith("J");
        System.out.println("First rule :"+ first);

        //            ii) It should have at least 8 characters
        //Note: There are "comparison operators" in Java:"==","<",">","<=",">=","!="
        //      When you use comparison operators, you will get "boolean" everytime
       boolean second = pwd.length()>7;
        System.out.println("Second rule :"+second);

        //            iii) LAst 3 characters should be "AVA"
        //Note:If you want to get characters from an index to the last character ,
        // use "substring()" method just with the starting index.
       boolean third = pwd.substring(5, 8).equals("AVA");
        System.out.println("Third rule:"+third);
/*
What did we learn today:
1)charAt()  ==> char
2)toUpperCase() ==>String
3)toLowerCase() ==> String
4)trim() ==> String
5) split() ==> we will learn it later
6) length() ==> int
7) substring(begging Index, Ending Index) ==> String
8)substring(begging Index) ==> String
9)equals() ==> boolean
10)equalsIgnoreCase()==>boolean
11)startsWith()==>boolean


Note : When you learn method in Java , you should learn
        i)What does the method do?
        ii)What are the different usages?
        iii)What does the method give you?
 */

    }
}
