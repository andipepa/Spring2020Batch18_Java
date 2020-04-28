package day07_IfStatments;

public class If_Else_Statment {
    public static void main(String[] args) {

        int number =1;

        if(number>0){
            System.out.println(number+ " is positive");
        }
        if(number<0){
            System.out.println(number+ " is negative");
        }
        if(number>0){
            System.out.println(number+ " is positive");
        } else {
            System.out.println(number+ " is negative"); }

        int num= 101;
        if(num % 2==0){
            System.out.println(num+" is even number");
        }
        else {
            System.out.println(num+ " is odd number");
        }
      int age =20;
        if(age>=21){
            System.out.println("here is your drink");
        }
else {
            System.out.println("get out");
        }

boolean TestPositiveCorona=false;
if(TestPositiveCorona){
    System.out.println(" pray to god");
}
else {
    System.out.println("celebrate");
}


    }
}
