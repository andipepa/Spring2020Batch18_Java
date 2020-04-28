package day10_Switch_Scanner;

public class Switch_Statment {
    public static void main(String[] args) {
        byte a=5;
        float a1=4.5f;  //cant not be applied
        long a2=5l; ///
        boolean a3= true; ////

        switch (5){
            case 1:
                System.out.println("one");
                 break;

            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("Invalid case");
                break;


        }



    }
}
