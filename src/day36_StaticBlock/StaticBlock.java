package day36_StaticBlock;

public class StaticBlock {

    static {
        System.out.println("Hello World"); //whereever you put it runs first but only once
    }

    public static void main(String[] args) {
        System.out.println("Hello Andi");
    }
    public static void method1(){

        System.out.println("Custom method execute");//this will not be executed because need to be in main method
    }


}
