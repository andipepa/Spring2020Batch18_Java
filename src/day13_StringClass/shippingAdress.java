package day13_StringClass;

import java.util.Scanner;
/*
write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */


public class shippingAdress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your building number: ");
         String bnum = input.next(); //Enter

        input.nextLine(); //take out enter

        System.out.println("Enter street adress: ");
        String stAdress= input.nextLine();

        System.out.println("Enter city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter state name");
        String stateName= input.nextLine();

        System.out.println("Enter zip code: ");
        String zipCode= input.next();

        input.nextLine();//to take the enter
        System.out.println("Enter your full name");
        String fullName= input.nextLine();

        String result= "Ship to: "+ fullName +"\n\t\t" +bnum+ " "+ stAdress
                +"\n\t\t" + cityName +", "+ stateName+" "+ zipCode;

        System.out.println(result);



    }
}
