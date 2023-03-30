package day19constructorsaccessmodifiersstatic;

public class Students {
/*
  1) We need "constructor" to create an object from a class.
  2) When we create a class Java puts a constructor in it, because JAva knows classes are for creating objects
  3) When you create a class you would not see any constructor in it, but the class has constructor, it is invisible
  4) Invisible constructors are called "Default Constructor"
  5) To create a constructor follow the steps;
       i) Use access modifier mostly we use "public" access modifier
       ii) Use class name as constructor name
       iii) Open close constructor parenthesis
       iv) Open close curly braces
   6)When you create constructor manually Java will delete teh "default constructor"
   7)When can create many constructors in a class
       i) Constructors names will be same because every constructor uses class name as name
       ii) every constructor must have different parameters
   8)What are the different between "Method" and the "Constructor"?
       i)"Method"s have "return type" but "Constructors" do not have
       ii)"Method"s are for some actions,"Constructor"s are for object creation


 */
    public String stdName;
    public int age;
    public boolean success;
    public String gender;

    // Default constructor is the same with the following constructor
    public Students(){

    }
    //Create a constructor uses all variable
    public Students(String stdName, int age, boolean success, String gender){
        this.stdName = stdName;
        this.age = age;
        this.success=success;
        this.gender=gender;

    }
    //Create a constructor uses some variables
    public Students(String stdName,int age, boolean success){
        this.stdName = stdName;
        this.age = age;
        this.success=success;


    }

    //Crate constructor by using IntelliJ-> press right button and choose "Generate" after that press
    //"Constructor"  and choose which data you need


    public Students(String stdName, int age) {
        this.stdName = stdName;
        this.age = age;
    }
}
