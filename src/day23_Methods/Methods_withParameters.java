package day23_Methods;

import java.util.Scanner;

public class Methods_withParameters {


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();
        EligibleToBuyAlcohol(age);
    }

    public static void EligibleToBuyAlcohol(int age){


        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Go buy milk");
        }

    }

}
