package day25_MethodsRecap;

public class return_statment {

    public static void main(String[] args) {

        method1();

        System.out.println("Hello");//execute because its in main body
    }



    public static void method1(){

        if(10>9){
            return;
        }

        System.out.println("Hello Cybertek");//doesnt execute it has the return
    }


}
