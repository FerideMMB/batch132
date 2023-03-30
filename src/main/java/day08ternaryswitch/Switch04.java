package day08ternaryswitch;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
       //Example 1:Ask user to enter country name among “America, England, Germany, Turkey, India, Peru, Spain,
        // Bulgaria, Albania, France”
        //            Type code to print abbreviation of the countries. “US, UK, DE, TR, IN, PE, ES, BG, AL, FR”

        Scanner input = new Scanner(System.in);
        System.out.println("Enter country name among “America, England, Germany, Turkey, India, Peru, Spain, Bulgaria," +
                " Albania, France");
        String countryName = input.next().toLowerCase();

        switch (countryName){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.printf("IN");
                break;
            case "peru":
                System.out.printf("PE");
                break;
            case "spain":
                System.out.printf("ES");
                break;
            case "bulgaria":
                System.out.printf("BG");
                break;
            case "albania":
                System.out.printf("AL");
                break;
            case "france":
                System.out.printf("FR");
                break;
            default:
                System.out.println("Undefined country");


        }

    }
}
