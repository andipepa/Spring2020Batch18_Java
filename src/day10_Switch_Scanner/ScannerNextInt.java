package day10_Switch_Scanner;

import java.util.Scanner;

public class ScannerNextInt {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int num1 = input.nextInt();
        System.out.println("Weekly hours: ");
        int num2 = input.nextInt();
        System.out.println("Your hourly rate is: " + (num1/52/num2) );
    }
}
