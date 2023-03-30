package day16arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    //Common interview question
    public static void main(String[] args) {
        //Example 1:Find to closest integer in a given list
        //          [12, 15, 10, 14]==> 15 and 14
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(15);
        nums.add(10);
        nums.add(14);
        System.out.println(nums);//[12, 15, 10, 14]

        Collections.sort(nums);
        System.out.println(nums);//[10, 12, 14, 15]

        int minDiff = nums.get(1) - nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            //i=1 we use one because other way if it is 0(0-1) its will be negative value and in get method we cant use
            //minus numbers
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));
        }
        System.out.println(minDiff);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) - nums.get(i - 1) == minDiff) {
                System.out.println(nums.get(i - 1) + " and " + nums.get(i));
            }

        }

    }
}

