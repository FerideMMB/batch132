package day19constructorsaccessmodifiersstatic;

public class Teacher {
    /*
    public: Accessible from everywhere.
    private: Accessible only within the same class.
    protected: Accessible within the same class and in derived classes.
    default (package-private): Accessible within the same package.
     */
    public String teacherName = "Tom Hanks" ;
    protected long phone = 14084321265L;
    int salary=6000;

    private String ssn="3458792351";

}
