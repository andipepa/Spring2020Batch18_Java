package Day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {

        //pre: changes values of the variables imidietly
        //post: changes the value next step
         int a=100;
        System.out.println(++a); //a will be 101
        System.out.println(a); //i get 101 because i changed the value
         int b= 100;
        System.out.println(--b); //99 it changes imidietly its pre
        System.out.println(b);// still 99 now

        int A = 100;
        System.out.println(A++); //101
        System.out.println(A); //101
         int B= 100;
        System.out.println(B--);  //100
        System.out.println(B); //99

        int z=10;
        int x= ++z;
        System.out.println(x);
       int s= 10;
       int f= s++; //first line 10 next line 11
        System.out.println(f); //10
        System.out.println(s); //11
         double t= 3.5;
         double t1= t--; //3.5, after this line decreas t by 1
        System.out.println(t1);
        System.out.println(t);

        int v =25;

        System.out.println(v++); //25
        System.out.println(v--); //26
        System.out.println(v); //25
         int h= 2;
         int j=h;
        System.out.println(h++);







    }
}
