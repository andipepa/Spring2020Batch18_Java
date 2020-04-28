package Day05_Unary_ShorthandOperators;

public class variablesPractice {
    public static void main(String[] args) {

        int a1=100;
        float f1=(long)a1;
        double d1= (float)a1;
        //f1 = 100l
        //f1= 100.0
        System.out.println(f1);

        long l1= (long)f1;
        //l1=100
        System.out.println(l1);

        String name;
       // System.out.println(name); it gives error because didnt give a value

        name= "cybertek";
        System.out.println(name);


        System.out.println("5+2=" +(3+4));

long a= 30l;
long b= (short)a;
        System.out.println(b);
        double c= 10.5;

        float a2   =  100.987_6543f;

        short  b1  =  (byte) a ;

        byte  c1  = (byte) b;System.out.println(b);
        System.out.println(c1);


    }
}
