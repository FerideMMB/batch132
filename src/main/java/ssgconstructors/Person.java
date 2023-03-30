package ssgconstructors;

public class Person {
    /*
    Constructor  is a special method that is used to initialize an object
    Constructors are almost similar to methods except for two things- its name is the same as the class name and it has no return type

    -No Args constructor
    class Person
    public Person(){}

    -Parameterized constructor
    public Person(int age){}

    When we have more than one constructor, then it is constructor overloading in java.
     */
    String name;// object properties or variables
    int age;
    String job;
    public Person(){}
    public Person(String name, int age, String job){
        this.name=name;
        this.age=age;
        this.job=job;
    }

    public static void main(String[] args) {
        Person man=new Person("John",35,"Manager");
        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.job);

        Person woman=new Person();//no Args Object
        woman.name="Lucy";
        woman.age=23;
        woman.job="Accountant";
        System.out.println(woman.name);
        System.out.println(woman.age);
        System.out.println(woman.job);
    }
}
