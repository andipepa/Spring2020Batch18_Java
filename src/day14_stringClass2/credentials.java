package day14_stringClass2;

import java.util.Scanner;

/*
userName: cybertek
passWord: cybertekschool
 */
public class credentials {
    public static void main(String[] args) {
        String validUsername="cybertek";
        String validPassward= "cybertekschool";

        Scanner input = new Scanner(System.in);

        System.out.println( "Enter your username");
        String inputusername= input.next();

        System.out.println("Enter your pasword");
        String inputpasword= input.next();

        if(inputusername.equals(validUsername)&&inputpasword.equals(validPassward)){
            System.out.println("Log in succesfully");
        }else{
            System.out.println("Invalid credentials");
        }


    }
}
