package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Utilities {
    public static void main(String[] args) {

        int[] arr ={1,2,3}; //convert to string

       String r= Arrays.toString(arr);

        System.out.println(r);

        System.out.println(Arrays.toString(arr));

        String [] names ={"andi", "esat", "bahri", "osman"};
        System.out.println(Arrays.toString(names));

        double [] nums ={10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]+1);

        int [] num2 ={1,3,5,7};
        int [] num3 ={0,2,4,6};


    }
}
