package day11_scanner;
/*
write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
 */
// imort PackageName.ClassName

import java.util.Scanner;

public class salaryCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner object
        System.out.println("Enter your salary:");
        int salary= input.nextInt();

        System.out.println("Enter the state tax: ");
        byte stateTax = input.nextByte();
        double stateTaxPersantage= stateTax/100.0;

        System.out.println("Enter federal tax: ");
        byte federalTax =input.nextByte();
        double federalTaxpersentage = federalTax/100.0;

        double totalTax=(federalTaxpersentage+stateTaxPersantage)*salary;
        double salaryAftertax= salary-totalTax;
        System.out.println("Your salary after tax is: $"+salaryAftertax);

        System.out.println("Total tax; $"+totalTax);





    }
}
