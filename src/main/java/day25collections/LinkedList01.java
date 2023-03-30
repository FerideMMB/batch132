package day25collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        /*
       1) Removing operation needs too much tasks for Java , that is why if we need too much removing operation
          we do not prefer to use ArrayLists.
       2)Adding element/s into an ArrayLists makes Java reindex, this is too many tasks for Java ,that is why we do not
         prefer ArrayLists in adding operations
       3)LinkedList does not use indexes,LinkedList works with "nodes".Nodes have two parts:
         i)Data Part  ii)Pointer Part
         Pointer points the next element
         Last node is called as "Tail" and LinkedList has head points the first node
       4)When you remove any element Java changes just the pointers, does not touch the other elements.
         This is not too many tasks that is why we prefer to use "LinkedList" in removing operations.
         5)When you add any element Java changes just the pointers, does not touch the other elements.
         This is not too many tasks that is why we prefer to use "LinkedList" in adding operations
         6)ArrayList uses indexes, indexes are like addresses.When you have address, it is so easy  to find the element.
         Because of that ,ArrayLists are so successful in "search operations.
         7)LinkedList does not use indexes, it means "nodes" do not have addresses.
         When you do not have address, it will be so difficult to find the node.
         Because of that , LinkedLists are not successful in "search operations".
         8)If you create a functionality to add and remove museum visitors in an application use "LinkedList"
         If you create a functionality to add  zip code and  find zip codes for specific areas in an app,use "ArrayLists"

         As a summary ;LinkedList is successful in "adding" and "removing" operations but not successful in
         "search" operation
         ArrayList is successful in "search" operation but not successful in  "adding" and "removing" operations
         */

        LinkedList<String> names= new LinkedList<>();
        names.add("Ali");
        names.addLast("Brad");
        names.add(2, "Jim");
        names.addLast("Brad");
        names.addFirst("Angie");
        names.addLast("Brad");
        names.add("Ali");
        System.out.println(names);//[Angie, Ali, Brad, Jim, Brad, Brad, Ali]


        //Retrieves and removes the first element of this list.(Cut +Paste)
        String f1=names.remove();
        System.out.println(f1);//Angie
        System.out.println(names);//[Ali, Brad, Jim, Brad, Brad, Ali]

        //Removes the first occurrence  of the s specified element from this list , if it is  in present.
        //If this list does not contain the element, it is unchanged.
        //Returns "true" if this list contained the specified element
        boolean r1 = names.remove("Brad");
        System.out.println(r1);//true
        System.out.println(names);//[Ali, Jim, Brad, Brad, Ali]

        //Removes the element at the specified position in this list.
        //Returns the element previously at the specified position.
        String r2=names.remove(1);
        System.out.println(r2);//Jim
        System.out.println(names);;//[Ali, Brad, Brad, Ali]

        //Removes and returns the last element from this list
        String r3= names.removeLast();
        System.out.println(r3);
        System.out.println(names);//[Ali, Brad, Brad, ]

        //Removes the last occurrence of the specified element in this list.
        //If the List does not contain the element , it ic unchanged
        //Returns boolean
        boolean r4= names.removeLastOccurrence("Brad");
        System.out.println(r4);//true
        System.out.println(names);//[Ali, Brad]

        /*
        When you  learn a method focus on 3 things: i)What the method does?
                                                    ii)What the method returns?
                                                    iii)How the method behaves for specific scenarios?
         */
        LinkedList<String> students = new LinkedList<>();

        students.add("Ali");
        students.addLast("Brad");
        students.add(2, "Jim");
        students.addLast("Brad");
        students.addFirst("Angie");
        students.addLast("Brad");
        students.add("Ali");
        System.out.println(students);// [Angie, Ali, Brad, Jim, Brad, Brad, Ali]

        //removes and returns teh first element of this list.
        //This method is equivalent to removeFirst().
        //NoSuchElementException-if this list is empty

            students.pop();
        System.out.println();//[ Ali, Brad, Jim, Brad, Brad, Ali]

        //Retrieves and removes the first element of this list.
        //Returns the head of this list, or null if this list is empty
        students.poll();//[ Brad, Jim, Brad, Brad, Ali]

        //Retrieves, but does not remove, the head (first element) of this list.(Copy+ Paste)
        //Returns:the head of this list
        //NoSuchElementException – if this list is empty
       String r5= students.element();
        System.out.println(r5);//Brad
        System.out.println(students);//[ Brad, Jim, Brad, Brad, Ali]


       // Retrieves, but does not remove, the head (first element) of this list.(Copy +PAste)
       // Returns:the head of this list, or null if this list is empty
       String r6= students.peek();
        System.out.println(r6);//Brad
        System.out.println(students);//[ Brad, Jim, Brad, Brad, Ali]


        //Returns:the first element in this list
        //NoSuchElementException – if this list is empty
        String r7=students.getFirst();
        System.out.println(r7);//Brad
        System.out.println(students);//[Brad, Jim, Brad, Brad, Ali]

        String r8=students.get(1);
        System.out.println(r8);//Jim
        System.out.println(students);//[Brad, Jim, Brad, Brad, Ali]

        students.set(1,"John");
        System.out.println(students);//[Brad, John, Brad, Brad, Ali]


    }
}
