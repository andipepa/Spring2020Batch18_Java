package day14_stringClass2;

import java.util.Scanner;

public class credentials2 {
    /*
    precondition: username and pasword cant be empty
    if emty ; pleas enter the credentials
    valid credentials
    username: andi
    pasword:andipepa
    if user entered both right==>log in
    if user entered invalid username==> invalid username
    if user entered invalid pasword==> pasword is incorrect
    if both incorrect==> invalid username and pasword
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter your username");
        String inputusername= input.next();

        System.out.println("Enter your pasword");
        String inputpasword= input.next();

        boolean logedIn=inputusername.equals("andi")&&inputpasword.equals("andipepa");

        boolean invalidUsername = !inputusername.equals("andi") && inputpasword.equals("andipepa");

        boolean invalidPasword = inputusername.equals("andi")&& !inputpasword.equals("andipepa");

                       //user and pasword are not empty
        if(!inputusername.isEmpty() && !inputpasword.isEmpty()){
           if(logedIn) {

               System.out.println("Loged in");

           } else if(invalidUsername){
               System.out.println("user name is incorrect");

           } else if(invalidPasword){
               System.out.println("pasword is incorrect");
           }else {
               System.out.println("both user name and pasword are incorrect");
           }


        }else{
            System.out.println("Pleas enter the credentials");
        }




    }



}

