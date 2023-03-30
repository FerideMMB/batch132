package day33lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaForTextFiles {
    public static void main(String[] args) throws IOException {
        //How to access a text file and print the text on teh console
        Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).forEach(System.out::println);
                //How we can get the path we are going to file, right button,Code path/reference,path from content root
//        Java is OOP.
//                OOP has four principles.
//        1)Inheritance
//        2)Encapsulation
//        3)Polymorphism
//        4)Abstraction



        //Convert all characters in the text file to uppercase then print the text on the console
        Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);
//
//        JAVA IS OOP.
//                OOP HAS FOUR PRINCIPLES.
//        1)INHERITANCE
//        2)ENCAPSULATION
//        3)POLYMORPHISM
//        4)ABSTRACTION


        //Check if the text file has word "Java" in it
     boolean r1=   Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);//true
                //lines () method give stream in a line
        System.out.println("=========");
       //you create inner stream
                        Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).
                map(t->t.split(" ")).    flatMap(Arrays::stream).// you break the stream
                distinct().
                forEach(System.out::println);
//        Java
//        is
//        OOP
//         has
//        four
//        principles
//        1)Inheritance
//        2)Encapsulation
//        3)Polymorphism
//        4)Abstraction

                //flatMAp() broke inner streams but when we use split method it will give an Array, but we cannot use array
        // that is why we need to chage to stream Arrays::stream

        System.out.println("==========");
        //Get the words which end with "s" and print them on the console
        Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).// you break the stream
                filter(t -> t.endsWith("s")).
                 forEach (System.out::println);
//        is
//                has
//        principles
        System.out.println("=======");

        //Get the words distinctly , convert them to lower case, and print them on the console in reverse alphabetical order
        Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.toLowerCase()).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(System.out::println);

        //Find the total number of letters used in TextFile
        int r2= Files.lines(Paths.get("src/main/java/day33Lambda/MyTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.length()).
                reduce(Math::addExact).get();
        System.out.println(r2);//80





    }
}
