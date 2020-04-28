package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Nextline_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //fullAdress: 38 raymond street, waterbury, CT, 06706

        System.out.println("Building number:");
        int Bnumber= input.nextInt(); // 38+enter


        input.nextLine(); // used for taking out the enter from scanner

        System.out.println("Enter Street: ");
        String street= input.nextLine();// it takes the enter so we add another input


        System.out.println("Enter the zip code: ");
        String zipcode= input.next();


        input.nextLine(); //used to take the enter

        System.out.println("Enter the city name and state seperated by comma and space");
        String cityandState= input.nextLine();

        String fulladress= Bnumber+" "+street+", "+cityandState +" "+zipcode;
        System.out.println(fulladress);

        input.close(); //you close the scanner cant use any more



    }
}
