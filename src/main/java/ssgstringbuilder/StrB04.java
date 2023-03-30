package ssgstringbuilder;

public class StrB04 {
    public static void main(String[] args) {
    //    3. Write a Java program to insert a given string into a specific position of another string using StringBuilder.
        StringBuilder str1= new StringBuilder("Feride");
        StringBuilder str2 =new StringBuilder("Bekir");
        str1.insert(2,str2);
        System.out.println(str1);
    }
}
