package day29exteptionsmaps;

public class IllegalGradeException extends Exception{
    public IllegalGradeException(String message){
        super(message);

    }
    public IllegalGradeException(){
        super();//if you do not type super here it is still in there but we just can not see
    }
}
