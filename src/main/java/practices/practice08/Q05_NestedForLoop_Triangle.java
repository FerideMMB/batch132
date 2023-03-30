package practices.practice08;

import java.util.Scanner;

public class Q05_NestedForLoop_Triangle {
    /*
  Take the number of rows from user and print on console the shape based on rows.
                 *
                * *
               * * *
              * * * *
             * * * * *
   */
    public static void main(String[] args) throws InterruptedException {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of row");
        int row=input.nextInt();
        for(int i=0; i<row;i++){//Row control
            for (int space=row-i;space>1;space--){
                Thread.sleep(500);// when we put this method we can see slowly all the process
                System.out.print(" ");

            }
            for(int j=0;j<=i;j++){//Column control
                Thread.sleep(500);
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
