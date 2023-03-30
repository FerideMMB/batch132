package practices.practice04;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        //Example 3 :Type code to check if a specific element in an Array or not
        String[] str = {"Ellie", "Susan", "Tom", "Brad", "Ali", "Veli"};
        String name ="Brad";
         int counter =0;
         //1.Way
        for(String w: str){
            if(w.equals(name))
                counter++;

        }if(counter>0){
            System.out.println( name + " exists in the Array ");
        }else{
            System.out.println( name + " does not exist in the Array ");
        }

        //2.Way:
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[Ali, Brad, Ellie, Susan, Tom, Veli]

      int idx =  Arrays.binarySearch(str,name);
        System.out.println(idx);


    }
}
