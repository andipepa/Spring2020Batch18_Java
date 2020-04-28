package day20_ArraysContinue;

import java.util.Scanner;

public class M0nths {
    public static void main(String[] args) {
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int attempts =1;

        while (num>12 || num<0){
            System.out.println("Invalid Entery");
            System.out.println("Please re-enter the number");
            num =input.nextInt();
            attempts++;
            if(attempts==3 && (num>12|| num<=0)){
                System.out.println("Invalid entery, you already attempted 3 times");
                System.exit(0);
            }

        }

        String result= months[num-1];
        System.out.println(result);

    }
}
