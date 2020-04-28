package day21_avaragenumbers_Arrays;

import java.util.Arrays;

public class multiDimensionalArrays {
    public static void main(String[] args) {

        int [] [] arr2d= {{1,2,3,4},{5,6,7,8,9} };

        int[] arr1d= arr2d[0];
        System.out.println(Arrays.toString(arr1d));

        int num1= arr2d[0][3]; //index 0 from 2d and index 3 from 1d
        System.out.println(num1);

        char [] [] ch2D ={{'A','B','C'},{'D','G','T'},{'R','W','P'}};

      char ch1=  ch2D[1][0]; //D
        System.out.println(ch1);

        char[] ch2= ch2D[2]; //R W P
        System.out.println(Arrays.toString(ch2));

        char ch3 = ch2D[2][1];
        System.out.println(ch3);
    }
}
