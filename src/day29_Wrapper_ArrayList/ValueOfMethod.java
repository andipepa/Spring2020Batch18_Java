package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethod {
    public static void main(String[] args) {

        String str= "123";

        Integer a= Integer.valueOf(str);
        System.out.println(a+1);

        double a1= Integer.valueOf(str);
        System.out.println(a1);

        String str2= "15.5";
         double d1= Double.parseDouble(str2);

         double d2= Double.valueOf(str2);

        System.out.println(d1+d2);

        String str3= "true";
         boolean b1= Boolean.valueOf(str3);
        System.out.println(b1);
        System.out.println("======================================");

        int maxNum = Integer.MAX_VALUE;
        int minNum = Integer.MIN_VALUE;
        System.out.println(maxNum);
        System.out.println(minNum);
        double maxNum2= Double.MAX_VALUE;
        double minNum2= Double.MIN_VALUE;
        System.out.println(maxNum2);
        System.out.println(minNum2);

        System.out.println("========================");

        double [] arr= new double[3];
        System.out.println(Arrays.toString(arr));


    }
}
