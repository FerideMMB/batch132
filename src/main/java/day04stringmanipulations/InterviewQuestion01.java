package day04stringmanipulations;

public class InterviewQuestion01 {
    //Example 1: Type to swap the integers
    //      a=12  and b=5  ==>a=5  and b=12
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        System.out.println(a +"-" +b);
// 1. Way : By using 3rd variable...
        int temp = 0;
        //1 step
        temp = a;
        //2 step
         a = b;
         //3step:
        b = temp;
        System.out.println(a+ "-"+b);

 // 2. Way: do not create 3rd variable

        int x = 12;
        int y = 5;
        System.out.println(x+" - " +y);//12-5
        x = x+y;

        y = x-y;

        x = x-y;
        System.out.println(x+ " - " +y);//5-12


    }
}
