package day17_whileLoops;

public class palindrromtest {
    public static void main(String[] args) {
        String str="java";
        String reversstr="";  //store the reversed version

        int index = str.length()-1; //last index

        while (index>=0){
       reversstr  += str.charAt(index);
       index--;

        }

        boolean palindrom= reversstr.equalsIgnoreCase(str);
        System.out.println(palindrom);
    }
}
