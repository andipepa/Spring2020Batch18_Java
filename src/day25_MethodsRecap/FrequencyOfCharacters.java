package day25_MethodsRecap;

import Resource.Library;


public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AABBCCGGGGTTTFFFF";
        String NonDub = Library.RemoveDuplicates(str);
        String result = "";
        for (int i = 0; i < NonDub.length(); i++) {

            String ch = "" + NonDub.charAt(i); //"A"

            int num = Library.Frequency(str, ch);
            result += num + ch;
        }
        System.out.println(result);
    }

    public static String FrequemcyOfChars(String str) {
        String NonDub = Library.RemoveDuplicates(str);
        String result = "";
        for (int i = 0; i < NonDub.length(); i++) {

            String ch = "" + NonDub.charAt(i); //"A"

            int num = Library.Frequency(str, ch);
            result += num + ch;
        }
        return result;

    }
}