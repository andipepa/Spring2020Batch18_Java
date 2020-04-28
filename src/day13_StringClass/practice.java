package day13_StringClass;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String conc= word1.concat(word2);
        String conc1= word2.concat(word1);
        String r= conc.concat(conc1);
        System.out.println(r);

    }
}
