package practices.practice06;

public class Q04_Runner {
    public static void main(String[] args) {
        Q04_Volume volume=new Q04_Volume();
        System.out.println("Volume of cylinder is : " + volume.volumeOFCylinder(5,10));
        //Volume of cylinder is : 785.0


        System.out.println( "Volume of Rectangular Prism is : "+ volume.volumeOfRectangularPrism(4,5,11.5));

        //Volume of Rectangular Prism is : 230.0


        Q04_Area area=new Q04_Area();
        System.out.println("Area od square is : " + area.areaOfASquare(4.5));
        //Area od square is : 18.0


    }
}
