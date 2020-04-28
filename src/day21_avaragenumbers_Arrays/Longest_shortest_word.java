package day21_avaragenumbers_Arrays;
/*
2. write a program that can return the
logest string of text from an array
 */
public class Longest_shortest_word {
    public static void main(String[] args) {

        String [] names= {"Andi","Omer","Esat","Muhamed","Emrah","Ana"};
   int maxLength = names[0].length();
   int minLength = names[0].length();
   String longestWord ="";
   String shortestWord ="";

   for(int i= 1; i<names.length; i++){
       if(names[i].length()> maxLength){
           maxLength = names[i].length();
           longestWord =names[i];
       }
       if(names[i].length()< minLength){

           maxLength = names[i].length();
           shortestWord = names[i];
       }


   }


        System.out.println(longestWord);

        System.out.println(shortestWord);

    }
}
