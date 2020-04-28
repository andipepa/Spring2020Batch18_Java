package day24_Methods;

import java.util.Arrays;

public class returnMethods_Practice {
    public static void main(String[] args) {

        int []arr={2,4,3,1,5,7,8,9,56,43,68};
     int max=   maxNumber(arr);

        System.out.println(max);

     int min=   minNumber(arr);

        System.out.println(min);

    }


    public static int maxNumber(int[]arr){
        Arrays.sort(arr);
   return arr[arr.length-1];

    }

    public static int minNumber(int[]arr){

        Arrays.sort(arr);
        return arr[0];

    }


}
