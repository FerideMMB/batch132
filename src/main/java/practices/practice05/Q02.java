package practices.practice05;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
           /*
          Find the middle element in an integer array
          Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
          (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */
        int[]arr={12,5,8,21,13,15,50};
        Arrays.sort(arr);
        int middleIdx=arr.length/2;
        System.out.println(Arrays.toString(arr));//[5, 8, 12, 13, 15, 21, 50]
        if(arr.length %2 !=0){
            System.out.println(arr[middleIdx]);//13
            // System.out.println(middleIdx); if we run are code like that we will receive result 3 it is the index
            // if we change like upper way we will receive the middle number.
        }else{
          int middle=  (arr[middleIdx]+arr[middleIdx-1])/2;
            System.out.println(middle);//12 is result when we have given [5, 8, 12, 13, 15, 21]
        }


    }
}
