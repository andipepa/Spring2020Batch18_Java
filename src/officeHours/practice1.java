package officeHours;

import java.util.Scanner;
/*
-Declare int variables: seniorCitizens, nonSeniorCitizens, age
-Create a Scanner object
- Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
"Enter current count for seniorCitizens and nonSeniorCitizens:"

-Ask user to enter age:
"What is new citizen's age?"

-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

-At last, print another message:
"New seniorCitizens count ValueOfVariable"
"New nonSeniorCitizens count ValueOfVariable"

Example Run:

Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
 */



public class practice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizen = input.nextInt();
        int nonseniorCitizen = input.nextInt();
        int age = input.nextInt();

        System.out.println("What is new citizen's age?");
        String result="";
        if( age>=65){
            result="Senior citizen" +seniorCitizen;
        }else{
            result="Non-Senior Citizen"+nonseniorCitizen;
        }
        System.out.println(result);

    }
}
