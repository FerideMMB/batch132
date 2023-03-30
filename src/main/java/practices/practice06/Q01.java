package practices.practice06;

public class Q01 {
    /*

   Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.

     */

    public static void main(String[] args) {
        calculateAverage("Ali",55,60,40,60,90,100);//Ali's Average of exams: 67.5
        calculateAverage("Aisha",100,90,89,99,100);//Aisha's Average of exams: 95.6

        calculateAverage("Fatma", 90,80,50,89,99);//Fatma's Average of exams: 81.6
        calculateAverage("Veli",50,90,77);//Veli's Average of exams: 72.33333333333333
        //System.out.println(stdName+"'s Average of exams: " +String.format("%.2f",sum/mark.length));
        //When we use format"%.2f"  we will just 2 numbers in decimal part
        //Veli's Average of exams: 72.33

    }
    public static void calculateAverage(String stdName , double ... mark){

        double sum=0;
        for (double w:mark){
            sum+=w;
        }
        System.out.println(stdName+"'s Average of exams: " +String.format("%.2f",sum/mark.length));
    }
}


