package Day05_Unary_ShorthandOperators;

public class primitiveCasting {
    //implict casting; done automaticlly
    public static void main(String[] args) {
        int a = 10;
        long b = a; // implicit casting done automaticlly
        //b=10l
        System.out.println(b);
        int a1 =100;
        long b1= (long) a1; //this is manually done implecit
       // int c=b1; b1 is still long data type

        //Explicit casting; casting larger primitives to smaller

        int Inum = 100;
        byte Bnum= (byte)Inum;
        short Snum= (byte)Inum;

        double Dnum = 5.5;
        float Fnum = (float)Dnum;
        System.out.println(Fnum+1);

        float fnum= (int) Dnum; // its gonna give 5.0


        System.out.println(fnum);

        float F1 = 60.5f;
        int I1 = (int) F1;
        System.out.println(I1);

        double D1 = 10.5;
        long L1 = (int)D1;
        System.out.println(L1); //10

        long largerNum= 99999999999l;
         int intNum = (int)largerNum;
        System.out.println(intNum);  //it gives a different num because
                                     //that num is out of range of int
        char ch1= 'a';
        short sh1= (short)ch1;
        System.out.println(sh1); //its gonna give the corresponding nr of a

        char ch2=23456;
         double dbl1=ch2;
        System.out.println(dbl1);

        int z1= 10;
        double dbl2=z1;

        System.out.println(0+1);
        System.out.println((1)+(2));
    }
}
