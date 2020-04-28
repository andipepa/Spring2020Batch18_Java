package day29_Wrapper_ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        int a=100;

        Integer b = a;

        short s1= 200;
        int n1=s1;
        //Integer N1= s1;  it doesnt accept its dedicated to int butt...
         Integer N1 =n1;

         int a1= 20;
         float f1= a1;
       //  Float f2= a1; cant fit
        Float f2= f1;

        Integer I1= 200;
        int a2=I1;
                     //but you can assign any primitive to wrapper class
        Byte B1=126;
        int a3= B1;




    }
}
