package officeHourPractice_03_18_2020;

public class shorthandoperaterPractice {

    public static void main(String[] args) {
        int a=100;
        a +=200; //300
        System.out.println(a);
        a *=3; //900
        System.out.println(a);
        a -=500; // 400
        System.out.println(a);
        a %=4;
        System.out.println(a);
        a += 3*50;
        System.out.println(a);

        int x= 60;
      //  x= 3*60;
        x *= 3;
        System.out.println(x);
        x *= 3+5;
        System.out.println(x);
        System.out.println("+++++++++++++++++++++++++");
        ///devision
        int y= 800;
       // y= 800/4; ==200
        y /=4; //200
        System.out.println(y);
        y /= 2*5;
        System.out.println(y);

        y /= 5-3;
        System.out.println(y);
        y/= 6+4;
        System.out.println(y);

        System.out.println("=====================");
        //remainder
        int z= 25;
        //z =z%4; //1
        z %=4;
        System.out.println(z);

        int d = 'b';
        d %=5;
        System.out.println(d);

       int t= 400;
       t %= 5*2;
        System.out.println(t);








    }


}
