package day15_ForLoop;

public class reversStringLoop {
    public static void main(String[] args) {
        String str = "Java";
        String reverse1 = ""+ str.charAt(3)+str.charAt(2)+
                str.charAt(1)+str.charAt(0);
        String tex=reverse1.toUpperCase();
        System.out.println(tex);

        int lastindex =str.length()-1;

        for(int i = lastindex; i>=0;i--){
            System.out.print(str.toUpperCase().charAt(i));
        }
/*
write a program if the word is palindrome or no
if yes boolean true;
 */

    }
}
