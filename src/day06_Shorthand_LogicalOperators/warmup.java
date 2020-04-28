package day06_Shorthand_LogicalOperators;

public class warmup {
    public static void main(String[] args) {
    double numberOfgalons= 5;
    double galonsToliters= numberOfgalons*3.785;
    String result = numberOfgalons + " gallons ia equal to: " + galonsToliters+ "litres";
        System.out.println(result);
        System.out.println("===================================");

        double numberOfliters =1;
        double litersToGallons =numberOfliters/3.785;
        String result1 = numberOfliters + " liters is equal to: " + litersToGallons+ " gallons";
        System.out.println(result1);
        System.out.println("==================================");

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //b = -200+ -200*200%2=-200+ -40000%2 =-200+0
        System.out.println(b);

        int x= 300;
        int y= 400;
        int z= x + y - x * y + x/y;
        //  z = 300 +  400  - 300 * 400 + 300 / 400
        // z = 300 + 400 - 120000 + 300 / 400             300/400 ==> 0.75;
        // z = 300 + 400 - 120000 + 0 it takes it as int
        // z = 700 - 120000 = -119300

        System.out.println(z);

int r=20;
r +=5;
int v= 56;
v -=5;
        System.out.println(++r + --v + 2* --r);

        int g=32;
        g *=3;
        int h=45;
        h %=3;
        System.out.println(g++ + --g * ++h + h);



    }
}
