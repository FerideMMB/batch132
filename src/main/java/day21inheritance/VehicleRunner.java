package day21inheritance;

public class VehicleRunner {
    public static void main(String[] args) {


        Civic myCivic = new Civic(true);
        myCivic.move();//All vehicles move...
        myCivic.engine();//Honda uses perfect engine...
        myCivic.ecoSystem();//Using Civic is not expensive...
        int hashCode =myCivic.hashCode();
        System.out.println(hashCode);//142666848

    }
}

