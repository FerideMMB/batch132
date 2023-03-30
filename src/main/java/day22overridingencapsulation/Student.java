package day22overridingencapsulation;

public class Student {
    /*
   1)When we type code, we may need to hide some data for some reasons
       "Encapsulation" means "hiding data"(from all the other classes)(Class is our capsule and encapsulation is data hiding)
       2)After encapsulating data , if you need you may read the value by using "get method"(getter)

    */
    public String stdName;
    int stdGpa;
    private String psychologicalIssues="Depression";
    public String getPsychologicalIssues(){
        return psychologicalIssues;
    }


    public void setSuccess(boolean b) {
    }
}
