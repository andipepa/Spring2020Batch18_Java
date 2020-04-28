package ReplitSolutions;

import java.util.Scanner;

public class whileNames {
    public static void main(String[] args) {
        String [] names = {"Andi", "Ilia", "Gerti", "Endrit", "Kevin", "Sulo", "Esat", "Bahri", "Sep","Halil"};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int attempts=1;

        while (num>10||num<0){
            System.out.println("Invalit entery");
            System.out.println("Please try again");
            num= input.nextInt();
            attempts++;

            if(attempts==3&& (num>10||num<0)){
                System.out.println("You are out of moves: bye bye");
                System.exit(0);
            }

        }







    String resut= names[num-1];
        System.out.println(resut);
    }
}
