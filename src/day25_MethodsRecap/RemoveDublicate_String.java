package day25_MethodsRecap;

public class RemoveDublicate_String {
    public static void main(String[] args) {
        String str = "ABAB"; //AB expected

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {

                result += ch;
            }

        }

        System.out.println(result);

        String str2= "ABCABCABC";
           String result2= RemoveDublicate(str2);
        System.out.println(result2);



    }

    public static String RemoveDublicate(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {

                result += ch;

            }
        }
        return result;
    }
}