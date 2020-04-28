package day11_scanner;

import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter full name: ");
         String fullNmame= input.nextLine(); //nextLine execute even enter

        System.out.println(fullNmame);

        System.out.println("Enter your sentence: ");

        String sentence= input.nextLine();

        System.out.println("You entered: "+sentence);



    }
}
