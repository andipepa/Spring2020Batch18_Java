package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

       // String str= scan.next(); //next takes only the first word
       // System.out.println(str);

        // 38 Raymond St, Waterbury Ct, 06706
        String fullAdress="";

        System.out.println("Enter the number of the building: ");
         short Bnumer= scan.nextShort();

         fullAdress += Bnumer+" ";

        System.out.println("Enter the Street Name: ");

        String streetName = scan.next();
        fullAdress += streetName+" ";

        System.out.println("Enter type of the road");
        String roadtype= scan.next();
         fullAdress += roadtype+", ";

        System.out.println("Enter city name, state, zipcode");
        String cityName = scan.next();
        fullAdress+= cityName+" ";

        String stateName= scan.next();
        fullAdress += stateName+", ";

        String zipCode= scan.next();
        fullAdress+= zipCode;

        System.out.println(fullAdress);


    }
}
