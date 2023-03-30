package day19constructorsaccessmodifiersstatic;

public class TeacherRunner {
    public static void main(String[] args) {


        Teacher myTeacher=new Teacher();
        //teacherName is "public" that is why we can access it from entire the project
        System.out.println(myTeacher.teacherName);//Tom Hanks

        //phone variable is "protected" that is why we can access it from inside the package
        //phone variable and myTeacher object are in "day19constructorsaccessmodifiersstatic" package
        System.out.println(myTeacher.phone);//14084321265

        //salary variable is "default" that is why we can access it from inside the package
        //salary variable and myTeacher object are in "day19constructorsaccessmodifiersstatic" package
        System.out.println(myTeacher.salary);//6000

        //In Teacher  Class , there is one more variable  which is "ssn" but it is private
        //that is why we cannot access to it from TeacherRunner Class


        //1)If you are in different package default variables will be "inaccessible";
        //2)If you are in a different package and the class you created the object is not the "child class" "protected
        // variables will be "inaccessible"
        //3)"private" things cannot be accessible from outside the class
        //4)"public" ones will be accessible from entire the project

        //Note : A Class be "public" or "default", do not use "private" and "protected" for the classes

    }
}
