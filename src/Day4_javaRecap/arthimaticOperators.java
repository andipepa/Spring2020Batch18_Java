package Day4_javaRecap;

public class arthimaticOperators {
    public static void main(String[] args) {

        int a =10/3;

        System.out.println(a); //3 but normaly its 3.33333 int doesnt have decimals

        // 10/4==2.5
        System.out.println(10/4); //2 takes as int
         double d = 10/4; //double d =2
        System.out.println(d); //2
        System.out.println(10.0/4); //2.5 now it takes it as double
        System.out.println(10/4.0); //2.5
        System.out.println(10.0/4.0); //2.5

        //10/4= 2.5
        float f1= 10/4; //2
        System.out.println(f1); //2.0
        float f2 =10/4f; //2.5
        System.out.println(f2);

        boolean evenNUmber1 = 15%3==0;
        boolean evenNumber = 25%2==0;
        //if 25/2 has a riminder is zero,then its even number
        System.out.println(evenNumber);
        System.out.println(evenNUmber1);

        boolean oddNUmber= 22 % 2 !=0;
        System.out.println(oddNUmber);

        System.out.println(10 % 2 ==0); //even
        System.out.println( 11 % 2 ==0); //odd number
        System.out.println("10 is even number: " + (10%2==0));
        System.out.println("11 is even number: " + (11%2==0));

        System.out.println("25 is odd number: " + (25%2==0));
        System.out.println("25 is even number: " + (25%2!=0));

        int i=5;
        float f= 4.5f;
        System.out.println("i is even number: " + (i%2==0));
        System.out.println(f);



    }










}
