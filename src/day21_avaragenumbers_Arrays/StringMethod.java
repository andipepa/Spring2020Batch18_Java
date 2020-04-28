package day21_avaragenumbers_Arrays;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Java";

        char [] chars= name.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[3]);

        String str = "I Love Java";

        String [] arr= str.split(" ");
        System.out.println(Arrays.toString(arr));

        //now reverse this

        String sentence= "Today is a rainy day";
        String [] words = sentence.split(" "); // [Today,is,a,rainy,day

        for( int i =words.length-1; i>=0; i--){

           String eachwords = words[i];
            System.out.print(eachwords+ " ");


           String str2= "ABCDE";
            String arr2[]= str2.split("");
            System.out.println(Arrays.toString(arr2));

        }

    }
}
