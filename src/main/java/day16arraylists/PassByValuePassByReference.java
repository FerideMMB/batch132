package day16arraylists;

public class PassByValuePassByReference {
    public static void main(String[] args) {

        /*
        1)PassByValue creates a copy of the value and uses the copy in the method.
        That is why methods change just the copy not original value.
        Java uses PassByValue to protect original values
        2)Some programming languages  like C-Sharp use PassByReference.
        PassByReference creates the copy of the reference(address) and use the copy in the methods.
        Copy reference and original reference point the original value that is why original is updated by the methods.
        I mean if you use PassByReference, you cannot protect original values
         */
        ///*/
        //Pass by Value : If you use a variable inside a method Java creates a copy of the variable,
        //and uses the copy of the value of the variable instead of the original value of the variable.
        //Java does not use the variable itself, it protects the original value of the variable.
        //This process is called "Pass By Value".
        // */

        int shirtPrice = 100;
        studentShirtPrice(shirtPrice, 10);
        System.out.println(shirtPrice);//100

        String name = "Ajda";
        String result = putExclamation("Ajda");
        System.out.println(result);//Ajda!

        System.out.println(name);//Ajda

        double newSalary = increaseSalary(20000);
        System.out.println(newSalary);//24000.0

        int abs = getAbsoluteValue(-5);
        System.out.println(abs);//5

    }

    public static void studentShirtPrice(int shirtPrice, int discount) {
        int dicountedPrice = shirtPrice - discount;
        System.out.println(dicountedPrice);//90
    }

    public static String putExclamation(String name) {
        return name + "!";
    }
    //Create a method increases the salary 20 percent


    public static double increaseSalary(double salary) {
        return salary * 1.2;

    }


//Create a method calculates the absolute value of an integer

    public static int getAbsoluteValue(int n) {

        if (n < 0) {
            return -1 * n;

        } else {
            return n;
        }
    }

}




