package day37_Constractor;

public class StaticsReviw {
    static String name="Aron";

    public static void main(String[] args) {
        System.out.println("Daniel");
    }

    public static void print(String str) {
        System.out.println(str);

    }
    static {
        print(name); //static runs first always so its "Aron" then main method
    }

}
