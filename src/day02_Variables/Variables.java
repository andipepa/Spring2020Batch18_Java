package day02_Variables;

public class Variables {
    public static void main(String[] args) {
       /*
       declare variable
       DataType  variableName= Data
        */
       byte l = 4;
       byte w = 2;
       byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
        // byte number = 2.5 byte, short, int, long, only accept whole numbers
        // byte num1 = 130 gives wrong becouse exeeds the range of byte

        // short num2 = 3.5 cant
        short num3 = 1000;
        System.out.println(num3);
        // short num4 = 40000; exeeds the range of  short
        System.out.println(12345); //compailer takes it as int
        int n1 = 20000;
        int n2 = 1000000000;
        System.out.println(n2);
        //int n3 = 99999999999; its out of int range its a long
        long n4 = 99999999999l; // you have to ad l or L to tell the compailer its a a long and not int
        System.out.println(n4);
        System.out.println(99999999999l);
        // larger one can not be assigned at smaller one
        // double > float > long > int > short > byte
        short s1 = 10;
        // byte b1 = si -> short is larger than byte
        int i1 = s1; // smaller one can be assigned to larger one
        System.out.println(3.5);
        double d1 = 3.5;
        //float f1 = 4.5; // it assume it as double thats why gives error
float f2 = 5.5f; //we add f not to take it as double
        System.out.println(f2);
        System.out.println("=============================================");
        float pi = 3.14f;

        double p = 3.14;

        int a1 = 3000;
        double d2 = a1; //its gonna show 3000.0
        System.out.println(d2);
        long l2 = 40;
        float f3 = l2;





    }
}
