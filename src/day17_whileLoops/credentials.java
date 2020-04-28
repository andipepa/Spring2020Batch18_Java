package day17_whileLoops;


import java.util.Scanner;

public class credentials {
    /*
    user;cybertek
    pass;cybertek123
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name");
        String username= input.next();

        System.out.println("Enter Password");
        String pasword= input.next();
boolean valid= username.equals("cybertek") && !pasword.equals("cybertek123");
        int count =1;

        while (!username.equals("cybertek") && !pasword.equals("cybertek123")){
            System.out.println("Pleas re enter your credentions");
            System.out.println("Enter user name");
            username= input.next();

            System.out.println("Enter Password");
            pasword= input.next();
valid= username.equals("cybertek") && !pasword.equals("cybertek123");

    count++;
    if(count==3){
        System.out.println("your account is locked");
        break;
    }


}
        if(valid) {
            System.out.println("Logged in");
        }
        }




    }


