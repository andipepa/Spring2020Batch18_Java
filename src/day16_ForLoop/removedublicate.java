package day16_ForLoop;

import java.util.Scanner;

public class removedublicate {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        /////String str= "aaasssddddkkklllleeerrrhhhdddjkakajdhbdb";
         String str= scan.next();

        String result="";

        for(int i =0; i<= str.length()-1;i++){

            if(result.contains(""+ str.charAt(i))){
                continue;

            }
            result+= str.charAt(i);

        }

        System.out.println(result);




    }
}
