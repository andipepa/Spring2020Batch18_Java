package ReplitSolutions;

import java.util.Scanner;

public class calculationloop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=n-1; i>=0;i--){

            n =n +i;
        }

        System.out.println(n);



    }


}
