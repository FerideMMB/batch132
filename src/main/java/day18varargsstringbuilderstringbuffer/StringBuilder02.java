package day18varargsstringbuilderstringbuffer;

public class StringBuilder02 {
    public static void main(String[] args) {
        //Another way to create a StringBuilder
        StringBuilder sb1 = new StringBuilder();//Java first  create 16 empty boxes, when you exceed this 16 boxes, you will
        //have another 16+2, next 34*2 +2,....
        sb1.append("Java");
        sb1.append("xxxxxxxxxxxxx");
        sb1.append("mmmmmmmmmmmmmmmmmm"); //35 characters/

        //length() method gives the number of characters used in the String
        int length = sb1.length();
        System.out.println(length);//17

        //capacity() method
        int capacity = sb1.capacity();
        System.out.println(capacity);//34<==16*2+2     70<==34*2+2

        //Another way to create a StringBuilder
        StringBuilder sb2 = new StringBuilder(2);
        sb2.append("FL").append("!");

        int l1 = sb2.length();
        System.out.println(l1);//2

        int c1 = sb2.capacity();
        System.out.println(c1);//2

        int l2 = sb2.length();
        System.out.println(l2);//3

        int c2 = sb2.capacity();
        System.out.println(c2);// 6 - because we are exceeding 2 that is reason to be 6<=2+(2+2)

        //Create a String by using StringBuffer Class
        StringBuffer sbf=new StringBuffer();

        sbf.append("Wooow!");
        int l3=sbf.length();
        System.out.println(l3);//6

        int c3=sbf.capacity();
        System.out.println(c3);//16



    }
}