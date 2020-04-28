package Day4_javaRecap;

public class primitives_practice {

    public static void main(String[] args) {
        //DataType variableName =
        byte num1= 127;
        short num2 = num1; //double>float>int>short>byte
        int num3 = num2;
        long num4= num3;
        long num5= 9999999999999l;
        float num6= 100l;
        System.out.println(num6);// 100.0
        float num7= 0.56f; //double is prefered so add f
        double num8= 0.56f;
        double num9= 99999999999l;
        System.out.println(num9);// its gonna print as decimal
        double num10= 100.5;
        System.out.println(num10); //100.5

        char ch1= '$'; //every single character has an corresponding number
        System.out.println(ch1);
        char ch2= 450;
        System.out.println(ch2);
int a1= '8';
        System.out.println(a1); // 56 is the character
       int a2= 'z'; //122
        System.out.println(a2);
        double d1= ('z'+'8');
        System.out.println(d1); //178.0
        char ch4='z'+'8';
        System.out.println(ch4);/// its gonna give a single character z+8=178


        boolean bool1=true;
        boolean bool2=false;

        System.out.println(9>10); //false

        System.out.println(9>=9); //true

        System.out.println(9!=10); //true

        System.out.println('a'=='b');  //false

        System.out.println('a'=='b'-1); //true  97==98-1

        //System.out.println('a'=="a"); // '' does not match ""

        System.out.println("Andi"=="Good guy"); //false not same text

        System.out.println("Andi" != "good guy"); //true
        System.out.println("Andi"=="andi"); //false

        boolean r1= !true; //false  !==opossite

        System.out.println(r1); //false
        System.out.println(!r1); //true

        System.out.println(!true==false); //true
        System.out.println(!true != !false); //true
















        }

}

