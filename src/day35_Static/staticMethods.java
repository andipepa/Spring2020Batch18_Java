package day35_Static;

public class staticMethods {

    int a=100;

    static int b=200;
    public static void main(String[] args) {

        staticMethods obj1= new staticMethods();
        System.out.println(obj1.a);

        System.out.println("================================");

        System.out.println(b);
        System.out.println(staticMethods.b);//use this in the future
        System.out.println(obj1.b);///but don use this

    }


    public void method(){

        System.out.println(a); //this instance so accepts a

        System.out.println(b); //accept even static because static can be use everywhere

    }





}
