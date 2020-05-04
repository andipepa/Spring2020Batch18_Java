package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    //write a program that can return unique from arraylist of characters

    public static void main(String[] args) {

        Character [] chars= {'A','B','A','B','C','D'}; //turnet object to arraylist

        ArrayList<Character> charlist= new ArrayList<>(Arrays.asList(chars));

        System.out.println(charlist);

        ArrayList<Character> result= new ArrayList<>(); //to set the uniques at the end

        for(int i=0;i<charlist.size();i++) {

            int count = Collections.frequency(charlist, charlist.get(i));
            if (count == 1) {
                result.add(charlist.get(i));
            }
        }
        System.out.println(result);



    }
}
