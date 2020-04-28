package day24_Methods;

import java.util.Arrays;

public class Array_Descending {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 3, 5, 76, 6};
        int[] arr2 = {3, 2, 12, 54, 63};
        int[] arr3 = {7, 8, 9, 67, 56, 64};

        sortDescending(arr1);
        sortDescending(arr2);
         sortDescending(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }


    public static int[] sortDescending(int[]arr1){
        Arrays.sort(arr1);

        int[] RevArr= new int[arr1.length];


        int j=arr1.length-1;
        for(int i=0; i<arr1.length;i++){
            RevArr[i]=arr1[j];

            j--;
        }

        return RevArr;

    }


}
