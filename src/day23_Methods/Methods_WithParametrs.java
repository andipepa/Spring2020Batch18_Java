package day23_Methods;

public class Methods_WithParametrs {
    // creat a function that can reverse any string

    public static void main(String[] args) {
        String names= "Andi";

        ReverseString(names);

        String names2= "I love Cybertec";
        ReverseString(names2);


    }

    public static void ReverseString(String str){

        for(int i= str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));

        }
        System.out.println();

    }


}
