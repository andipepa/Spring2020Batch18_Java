package Day05_Unary_ShorthandOperators;

public class unaryOperators {
    public static void main(String[] args) {

        int a=10; //positive 10
        int b=+a; //positive 10
        System.out.println(a);
        System.out.println(b);
         int a2= -10;
         boolean result1= a2>0; //false
        boolean result2= a2<0; //true
        System.out.println(result1);
        System.out.println(result2);
         int x1= -10;
         int y1= -x1; //positive
        System.out.println(y1);

        int x2=+20;
        int y2=-x2;
        System.out.println(y2);
        int x3=+20;
        int y3=+x3;
        System.out.println(y3);

        int z=100;
        System.out.println(++z); //101 pre increment
        System.out.println(z); //101

         int p = 100;
        System.out.println(p++); //post increment gives still 100
        System.out.println(p); //here it gives 101






    }
}
