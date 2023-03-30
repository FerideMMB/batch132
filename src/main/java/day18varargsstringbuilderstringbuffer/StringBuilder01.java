package day18varargsstringbuilderstringbuffer;

public class StringBuilder01 {

    /*
    1)"StringBuilder" is a Class in Java , it is used to create Strings.
    2)Question: We have "String Class" to create "Strings" , why did Java create "StringBuilder" class to create String?
              "String class" is "Immutable" we sometimes need "Mutable Strings" that is why Java created "StringBuilder"
    3)StringBuilder is NOT "thread-safe" and is NOT "synchronized"
    "thread-safe" means being able to do "multiple thread(task)" at same time
    "synchronized" means being able to select appropriate order for "multi thread"//QA  do not write code for multiple thread

   4) If you need a String to use in "multi thread" use "StringBuffer"
   "StringBuffer" is a Class in Java, and it is used to create Strings
   "StringBuffer" is a "thread-safe" and it is "synchronized"

   "StringBuffer" was created before "StringBuilder", it was created in Java 5
   "StringBuffer" is slower than "StringBuilder"

   To create String we have 3 options:
   i)String Class; If you need "immutable String" use String Class to create a String
   ii)StringBuilder Class: If you need "mutable String" and do not need "multi thread" and "synchronized" use
                           StringBuilder Class to create a String
    iii)StringBuffer Class: If you need "mutable String" and  "multi thread" and "synchronized" use
                           StringBuffer Class to create a String

        Note:StringBuilder is faster than StringBuffer

     */
    public static void main(String[] args) {
        String s="Java";
        //String Class is "Immutable" that is why when you do any update on "s". Java does not change the value in "s container"
        //Java creates  a new container for the updated value and puts the updated value in the new container
        String t = s.concat("!");
        System.out.println(s);//Java
        s=s.concat(("Wooow"));
        System.out.println(s);//JavaWooow

        //Lets  us create a "Mutable String"
        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println(sb1);//Java

        //When I use any method to update a StringBuilder original value will be updated.
        //In string to add something we use concat , but in StringBuilder we use "append"
        sb1.append("!").append("...");
        System.out.println(sb1);//Java!

       //insert (4, " is love"); will skip first 4 characters, then insert " is love"
        sb1.insert(4, " is love");
        System.out.println(sb1);//Java is love!...

        sb1.insert(2,"Money",1,4);
        System.out.println(sb1);//Jaoneva is love!...

        sb1.replace(2,5,"1");
        System.out.println(sb1);//Ja1va is love!...

        //delete method  it was not exist in string class it is existing in StringBuilder
        sb1.deleteCharAt(2);
        System.out.println(sb1);//Java is love!...

        sb1.delete(8, 12);
        System.out.println(sb1);//Ja1va is !...

        //If " Reverse a String" question is asked to you  in an interview, do not forget to mention about reverse()
        //method in StringBuilder Class.
        sb1.reverse();
        System.out.println(sb1);//...! si avaJ

        //toString();  is fro converting "StringBuilder" to "String", but toString(); does not change the structure of
        // original "StringBuilder"
        String newS=sb1.toString();

        StringBuilder sb2= new StringBuilder("Lava");
        StringBuilder sb3= new StringBuilder("Java");

      //sb2.compareTo(sb3); method compares sb2 with sb3 lexicographically(alphabetically)
       // If sb2  is before sb3 thh result will be negative, If sb2 after sb3 the result will be positive
        // The int value method returns displays teh difference between th ASCII values
       int r =sb2.compareTo(sb3);
        System.out.println(r);//2

    }
}
