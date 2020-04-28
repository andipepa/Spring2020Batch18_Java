package day17_whileLoops;

import java.util.Scanner;

public class whileloopspractice {
    public static void main(String[] args) {
        /*
        ask user to enter yes or no
        if the user enters other than yes or no,repeat previous step
         */
        Scanner input =new Scanner(System.in);

        System.out.println("Enter yes or no");
        String word =input.next();

        boolean valid = word.equalsIgnoreCase("yes")|| word.equalsIgnoreCase("no");
        while(!valid){
            System.out.println("pleas re-enter");
            word = input.next();

            if(word.equalsIgnoreCase("yes")|| word.equalsIgnoreCase("no")){
                break;
            }

        }
        if(word.equalsIgnoreCase("yes")){
            System.out.println("Entered yes");
        }

          if(word.equalsIgnoreCase("No"))
              System.out.println("Entered no");
    }
}
