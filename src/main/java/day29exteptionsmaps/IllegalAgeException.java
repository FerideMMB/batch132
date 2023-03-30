package day29exteptionsmaps;

public class IllegalAgeException extends RuntimeException{
    public IllegalAgeException(String message){
        super(message);//this is parent constructor

    }
    public IllegalAgeException(){
        super();
    }
}
