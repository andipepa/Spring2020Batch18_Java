package day11_scanner;

import java.util.Scanner;

public class nextLine_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age= input.nextByte(); //when enter age 32+Enter
        System.out.println("Your age is: "+age);

        input.nextLine(); //we give this next line to take out the enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println("Your name is: "+fullName);





    }

}
