package day33_CustomClass;

import java.util.ArrayList;

/*
     write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
     */
public class ExtractChars2 {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialchars = new ArrayList<>();

        for(int i=0; i<str.length();i++){
          char each =  str.charAt(i);

            if(Character.isLetter(each)){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else {
                specialchars.add(each);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialchars);


    }

}
