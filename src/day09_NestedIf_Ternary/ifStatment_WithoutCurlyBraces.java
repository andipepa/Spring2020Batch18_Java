package day09_NestedIf_Ternary;

public class ifStatment_WithoutCurlyBraces {
    public static void main(String[] args) {
        int number=100;
        if(number%2==0)
            System.out.println("Even number");//only one single statment without{}


        else
            System.out.println("Odd number");
        if(9<8) {     //if the block contain more then one statment
            System.out.println("hello");
            System.out.println("condition is true");
            System.out.println("test executed");
        }
    }
}
