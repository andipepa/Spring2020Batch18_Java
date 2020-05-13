package day38_Costructor;

public class ConstructoCalls2 {

    public ConstructoCalls2(){
        System.out.println("Default constructor");

    }
    public ConstructoCalls2(int a){

        this();
        System.out.println("Costructor with int argumant");


    }
    public ConstructoCalls2(String str){
        this(7);
        System.out.println("Costructor with Strin argument");
    }

    public static void main(String[] args) {

        ConstructoCalls2 obj= new ConstructoCalls2("Hello");

    }
}
