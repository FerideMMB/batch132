package ssgconstructors;

public class Employee {
    /*
    Create an employee class, employee has name, role, salary, in main method create employee object using constructor
     */
    String name;
    String role;
    int salary;
    public Employee(){}
    public Employee(String name, String role, int salary){

        this.name=name;
        this.role=role;
        this.salary=salary;
    }

    public static void main(String[] args) {
        Employee s1=new Employee("Elisa", "QA", 3000);
        System.out.println(s1.name);
        System.out.println(s1.role);
        System.out.println(s1.salary);
    }

}
