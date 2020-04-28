package day26_MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        method(10,8);
    }
    public static void method(int a){
        System.out.println("originla method");

    }
    public static void method(int a,int b){
        System.out.println("overloaded method");

    }
}
