package day18_nestedloop;

public class StringReverse {
    public static void main(String[] args) {
        String str="Java";
        String rev="";

        int lastindex= str.length()-1;

        do{


      rev   += str.charAt(lastindex) ;
          lastindex--;
        }while(lastindex>=0);

        System.out.println(rev);

    }
}
