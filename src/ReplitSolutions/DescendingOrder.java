package ReplitSolutions;


import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7};


        Revers(arr);

    }


public static void Revers(int[] arr){

    int [] revers= new int[arr.length];


    int j= arr.length-1;

    for(int i=0; i< arr.length;i++){
        revers[i]= arr[j];
        j--;

    }

    System.out.println(Arrays.toString(revers));

}





    }




