package day03_VariablesContinue;


public class VariablesContinue {
    public static void main(String[] args) {
        double hourlyRate= 65;
        double stateTaxrate= 0.04;
        double federalTaxrate= 0.22;
        byte weeklyHours= 40;
        double totalWeek= 52;

        double Salary= hourlyRate*weeklyHours*totalWeek;
        double stateTax= Salary*stateTaxrate;
        double federalTax= Salary*federalTaxrate;
        double salaryAfterTax= Salary-(stateTax+federalTax);
        double totalTax=federalTax+stateTax;

        System.out.println(salaryAfterTax);
        System.out.println("Your Salary is: $"+ salaryAfterTax);
        System.out.println("State tax is: $"+ stateTax);
        System.out.println("Federal tax is: $"+ federalTax);
        System.out.println("Total tax is: $"+ totalTax);
        System.out.println(Salary);


    }



}

