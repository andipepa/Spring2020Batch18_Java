package day15_ForLoop;

import java.util.Scanner;

/*
1. write a program that asks user's first and last name,
 then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
 */
public class warmUp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
       String firstname= scan.next();

        System.out.println("Enter your last name");
        String lastname= scan.next();

        String initials2 = firstname.substring(0,1)+ lastname.substring(0,1);
       initials2 = initials2.toUpperCase();

        String initials =""+ firstname.charAt(0)+lastname.charAt(0); //if yoy add that empty string it returns to string
        initials= initials.toUpperCase();

        System.out.println(initials);
        System.out.println(initials2);




    }
}
