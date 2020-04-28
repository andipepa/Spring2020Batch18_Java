package day17_whileLoops;
/*
1-write a program that can ask the user "enter a number" five times
 and return the maximum number
				hint: you will nedd for loop and if statement
2. write a program that can ask the user "enter a number" five times
and return the minimum number
 */

import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int Maxnumber= -2147483647; //any number provided will be greater

        int minNumber = 2147483647;


        for(int i =1; i<6; i++){
            System.out.println("Enter a number");
            int num =input.nextInt();
            if(num>Maxnumber){
                Maxnumber = num;
            }
            if(num< minNumber){
                minNumber=num;

            }


        }

        System.out.println(Maxnumber);
        System.out.println(minNumber);
    }
}
