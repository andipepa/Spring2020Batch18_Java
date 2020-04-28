package day19_arrays;

import java.util.Scanner;

/*
 write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */
public class Uniques {
    public static void main(String[] args) {
        Scanner input= new Scanner((System.in));
        System.out.println("Enter a word");
        String str = input.next();

        String result = "";

        for (int j = 0; j <= str.length() - 1; j++) {

            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result += str.charAt(j);
            }
        }

        System.out.println(result);
        }

    }