package day06_Shorthand_LogicalOperators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int x=20;
        x += 10; // x= x+10 = 30
        System.out.println(x);

        x += 60; // x =x+60= 90
        System.out.println(x);
         String schoolname="Cybertek";
         schoolname += 12345; // schoolname=12345
        System.out.println(schoolname);
        System.out.println('a' +'b'); //its char 97+98==195
         char ch1= 'a';
         ch1 += 'b';
        System.out.println(ch1); // its gonna give character because data is char

       int num ='z';
       num += 'x';
        System.out.println(num); //gives num because data type is int

        int A =100;
        A -= 90; //10
        System.out.println(A);
        int B = 200;
        B -=A; //200-10=190
        System.out.println(B);

        int a = 2;
        a *=3;
        System.out.println(a);
         int b =a *= 10; // b=a*10=60
        System.out.println(b);
        System.out.println(a);

        int a1=100;
        int b1 = (a1*=2)+ ++a1;
        //b1=200+201
        System.out.println(b1);
        int x1=10;
        int y= x1 +=10*2; //x1=20=30
        System.out.println(y);

        int num1= 300;
        num1 /= 2; //num1 = num1 /2
        System.out.println(num1);

        int num2= 400;
        num2 /=  20+10;  // num2= num2/ 30
                         // num2= 400/30 = 13.123// this is int so takes only 13

        System.out.println(num2);

        int num3 =300;
         num3 %= 10+20;  //num3 %= 30;  num3 = 300%30=0
        System.out.println(num3);

        int n1=400;
        n1 %=3*5;    // n1 %= 15 // 400/15=26.6666
        //remainder= 400-(15*26)=10
        System.out.println(n1);












    }
}
