package day12_JavaRecap;


import java.util.Scanner;

public class scanner_nextLine {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.next(); //takes only name no other
        System.out.println(name);

        input.nextLine(); //used to take off the Enter before

        System.out.println("Enter your name: ");
        String name1 = input.nextLine();
        System.out.println(name1);



    }
}
