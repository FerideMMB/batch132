package practices.practice07.inheritance;

public class Mathematics {
    public double multiply(double... x){
        double result=1;
        for(double w:x){
            result*=w;

        }
        return result;
    }
    public double findSquare(double x){
        return x*x;
    }
}
