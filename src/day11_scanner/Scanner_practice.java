package day11_scanner;
/*
ask: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
 */


import java.util.Scanner;

public class Scanner_practice {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname= input.next();

        System.out.println("Enter your last name: ");
        String lastname= input.next();

        String Fullname= firstname+lastname;


        System.out.println("Are you employeed?");
        boolean EmploymentStatus = input.nextBoolean();



        double salary =0;

        if(EmploymentStatus== true){
            System.out.println("Enter your salary: ");
            salary=input.nextDouble();

        }
        System.out.println("Full name is: "+ Fullname);
        System.out.println("Employeed: "+ EmploymentStatus);
        System.out.println("Your salary is: $" +salary);



    }


}
