package day10_Switch_Scanner;

public class SwitchStatment_Practice3 {
    public static void main(String[] args) {
        char ch = 'f';
        String result = "";

        switch (ch){
            case 'a':
               result = "a" ;
               // System.out.println("a");
                break;
            case 'b':
                result= "b";
                //System.out.println("b");
                break;
            case 'c':
                result="c";
               // System.out.println("c");
                break;
            case 'd':
                result="d";
                //System.out.println("d");
                break;
            default:
                result= "invalid";
                //System.out.println("invalid");
                break;
        }

        System.out.println(result);


    }
}
