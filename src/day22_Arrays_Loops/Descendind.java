package day22_Arrays_Loops;

import java.util.Arrays;

public class Descendind {
    public static void main(String[] args) {
        int [] arr={10,12,4,7,8,23,-34,-56,21} ;

       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] revarr = new int[arr.length];

     int j= arr.length-1;
for(int i= 0; i< arr.length; i++){
    revarr[i]=arr[j];
    j--;
}

        System.out.println(Arrays.toString(revarr));

    }
}
