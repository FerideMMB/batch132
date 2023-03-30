package day24interface;

public class CarRunner {
    public static void main(String[] args) {


        Honda myHonda = new Honda();
        myHonda.cool();
        myHonda.run();
        myHonda.heat();
        myHonda.bacteriaKiller();
        Ac.climate();

      //    Ac myAc=new Ac() ;"Ac" is interface ; cannot be instantiated
        System.out.println( Ac.price);//2000

        //Ac.price++;==>Cannot assign a valur to final variable 'price'
        System.out.println(Engine.price);//5000.0




    }
}

