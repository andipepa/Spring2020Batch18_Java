package day26_MethodOverloading;

public class MethodOverloading3 {
    //sum 2 int num
    //sum 2 double num

    public static void main(String[] args) {
        sum(5,5);
        sum(5,5.5);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
public static void sum(double a,double b){
    System.out.println(a+b);
}



}
