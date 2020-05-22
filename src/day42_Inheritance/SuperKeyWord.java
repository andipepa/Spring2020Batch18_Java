package day42_Inheritance;
class A {
    int a=100;
    public A(double b){
        System.out.println(this.a);

    }
}

public class SuperKeyWord extends A{
    int a=200;

    public SuperKeyWord(){
        super(2.3);
        System.out.println(super.a);
    }

    public static void main(String[] args) {

       // SuperKeyWord obj= new SuperKeyWord();

        A obj2= new A(2.2);

    }

}
