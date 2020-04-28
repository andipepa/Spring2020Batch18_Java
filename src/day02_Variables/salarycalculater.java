package day02_Variables;

import org.w3c.dom.ls.LSOutput;

public class salarycalculater {
    public static void main(String[] args) {

        double rate=65;
        double stateTax=0.04;
        double federalTax=0.22;
        double totalTax=stateTax+federalTax;
        double weeklyHours=40;
        double salary=rate*weeklyHours*4*12;
        double salaryAfterTax=(1-totalTax)*salary;
        System.out.println(salaryAfterTax);


    }





}
