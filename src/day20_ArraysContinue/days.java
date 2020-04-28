package day20_ArraysContinue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        String[]days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
                        //size;7, max index 6
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number; ");
        int num = input.nextInt();

        int attempt=1;
        while (num>7||num<1){
            System.out.println("Invalid entery, Please re-enter the number");
           num=input.nextInt();
           attempt++;

           if(attempt==3&&(num>7||num<1)){
               System.exit(0);
           }

        }

        String result = days[num-1];

        System.out.println(result);

    }
}
