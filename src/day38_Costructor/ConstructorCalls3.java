package day38_Costructor;

public class ConstructorCalls3 {
    public ConstructorCalls3(){
        this(9); //int argument
        System.out.println("default");

    }
    public ConstructorCalls3(int a){
       this("Hello");
        System.out.println("Int argument");

    }
    public ConstructorCalls3(String str){
        System.out.println("String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls3 obj3= new ConstructorCalls3();

    }


    public void method1(){

    }

}
