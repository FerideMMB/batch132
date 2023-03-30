package ssgstringbuilder;

public class StrB03 {
    //2. Write a Java program to concatenate two strings using StringBuilder.
    public static void main(String[] args) {
        StringBuilder str1= new StringBuilder("Feride");
        StringBuilder str2 =new StringBuilder(" Bekir");
        str1.append(str2);
        System.out.println(str1);

    }
}
