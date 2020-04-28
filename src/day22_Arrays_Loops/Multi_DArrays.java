package day22_Arrays_Loops;

import java.util.Arrays;

public class Multi_DArrays {
    public static void main(String[] args) {

        int[][] arr2D= {{1,2,3,4}};

        int [] arr1D= arr2D[0];
        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));

        System.out.println(arr2D[0][2]);
        System.out.println(Arrays.deepToString(arr2D));


    }
}
