package day33lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaForCourseObjects {
    public static void main(String[] args) {


        Course courseTurkishDay = new Course("Turkish Day Time", 124, "Summer", 97.2);
        Course courseTurkishNight = new Course("Turkish Night Time", 125, "Winter", 98.4);
        Course courseEnglishDay = new Course("English Day Time", 138, "Spring", 93.8);
        Course courseEnglishNight = new Course("English Night Time", 111, "Winter", 95);

        List<Course> courses=new ArrayList<>();
        courses.add(courseTurkishDay);
        courses.add(courseTurkishNight);
        courses.add(courseEnglishDay);
        courses.add(courseEnglishNight);
        System.out.println(courses);
        System.out.println(checkAvgScoresToBeGreaterThanAnyNumber(courses,91));//true
        System.out.println(checkIfAnyCourseNamesContainsAnyWord(courses,"Turkish"));//true
        printCourseWhoseAvrIsTheHighest(courses);//Course{courseName='Turkish Night Time', numOfStudents=125, season='Winter', averageScore=98.4}
        System.out.println(skipFirstTwiReturnOthersAfterSorting(courses));//[Course{courseName='Turkish Day Time', numOfStudents=124, season='Summer', averageScore=97.2}, Course{courseName='Turkish Night Time', numOfStudents=125, season='Winter', averageScore=98.4}]

        printThirdCourseAfterSortingReversed(courses);

    }
    //1)Create a method to check if all average scores are greater than 91
    public static boolean checkAvgScoresToBeGreaterThanAnyNumber(List<Course> courses,double avg){
         return courses.stream().allMatch(t->t.getAverageScore()>avg);
    }
    //2)Create a method to check if at least one of the course names contains "Turkish" word
    public static boolean checkIfAnyCourseNamesContainsAnyWord(List<Course> courses,String word) {
        return courses.stream().anyMatch(t -> t.getCourseName().contains(word));
    }
    //3)Create a method to print the course whose average score is the highest
    public static void printCourseWhoseAvrIsTheHighest(List<Course> courses){
       Course course= courses.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
        System.out.println(course);//Course{courseName='Turkish Night Time', numOfStudents=125, season='Winter', averageScore=98.4}
    }//sorted(Comparator.comparing(Course::gerAverageScore) it is given in ascending order , but if we use after this method we will get in descending order

public static List<Course> skipFirstTwiReturnOthersAfterSorting(List<Course> courses){
   return      courses.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
}
//Whenever you need to  multiple data  to put in a list, set or collection you can use collect(Collectors.toList(); if you do not know which data type we have you can use collect(Collectors.toCollection()


    //5)Sort the list elements according to the number of students in descending order and print just the 3rd one
    public static void printThirdCourseAfterSortingReversed(List<Course> courses){
        List<Course> course=  courses.
                stream().
                sorted(Comparator.comparing(Course::getNumOfStudents).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList());
        System.out.println(course);//[Course{courseName='Turkish Day Time', numOfStudents=124, season='Summer', averageScore=97.2}]
        // to can get 3rd one when we skip(2).limit(1) its will  skip first 2 and will give you 3rd
    }
}
