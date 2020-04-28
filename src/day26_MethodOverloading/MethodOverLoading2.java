package day26_MethodOverloading;

public class MethodOverLoading2 {

    public static void main(String[] args) {
        sum2Numbers(3,5);
        sum3Numbers(4,7,67);
        sum4Numbers(2,5,4,6);

        System.out.println("========================================================");

        sum(3,6,7,9);
        sum(2,5);
        sum(4,67,89);



    }


    /*
    1-print the sum of 2 numbers
    2-print the sum of 3 numbers
    3-print the sum of 4 numbers
     */
public static void sum2Numbers(int a,int b){

    System.out.println(a+b);
}
public static void sum3Numbers(int a,int b,int c){
    System.out.println(a+b+c);
}
public static void sum4Numbers(int a,int b, int c, int d){
    System.out.println(a+b+c+d);
}
//========================================================================
public static void sum(int a,int b){
    System.out.println(a+b);

}
public static void sum(int a,int b,int c){
    System.out.println(a+b+c);
}
public static void sum(int a,int b, int c, int d){
    System.out.println(a+b+c+d);
}


}
