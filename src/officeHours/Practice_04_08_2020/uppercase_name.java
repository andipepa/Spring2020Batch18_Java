package officeHours.Practice_04_08_2020;

import java.util.Scanner;
/*
Write a program that will print out information about the user
 based on email. Print first and last name from the email with
  the upper case. (Assume that first and last names were separated
  by an underscore)

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
public class uppercase_name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int underscore = email.indexOf("_") ;
        int et = email.indexOf("@");
        int dot =email.indexOf(".");
        String firstname= email.substring(0,1);
        firstname= firstname.toUpperCase();
        String firstName= email.substring(1,underscore);
        firstName=firstname.concat(firstName);
        String lastname= email.substring(underscore+1,underscore+2);
        lastname=lastname.toUpperCase();
        String lastName= email.substring(underscore+2,et);
        lastName= lastname.concat(lastName);
        String dom= email.substring(et+1,dot);
        String Topdomain= email.substring(dot+1);
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+dom);
        System.out.println("Top-leve Domain: "+Topdomain);
    }
}
