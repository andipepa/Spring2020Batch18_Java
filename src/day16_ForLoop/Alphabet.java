package day16_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        String uppercase = ""; //A~Z
        String lowercase = ""; //a~z

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            uppercase += ch;
        }
        System.out.println(uppercase);

        for (char ch = 'a'; ch <= 'z'; ch++) {
            lowercase += ch;

        }
        System.out.println(lowercase);

        // Aa Bb Cc .......
        String result ="";

        for(int i=0; i <= uppercase.length()-1; i++){
            result += uppercase.charAt(i)+ ""+ lowercase.charAt(i)+" ";
        }
        System.out.println(result);

        //second solution

        int a = 97; // from ascci table
        int A = 65;
        String result2="";
        for (int i = 0 ; i < 26; i++){
            char ch =  (char) (A+i); //upper case letters
                            //65
            char ch2 = (char) (a +i);
                            //97+0
            result2 += ch +""+ch2+" ";
        }
        System.out.println(result2);

    }
}