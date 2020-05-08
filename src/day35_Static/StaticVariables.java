package day35_Static;

public class StaticVariables {

    int a2=100; //instance variable

    static int a3=300; //static

    public static void main(String[] args) {

        int a1=100; //local variavle

        StaticVariables obj1=new StaticVariables();

     obj1.a2=2000;
     obj1.a3=3000;


        StaticVariables obj2 = new StaticVariables();
        obj2.a2 = 2000;

        obj2.a3 = 5000;


        System.out.println( obj1.a2 );
        System.out.println( obj2.a2 );

        System.out.println( obj1.a3 ); // 5000
        System.out.println( obj2.a3 ); // 5000



    }
}
