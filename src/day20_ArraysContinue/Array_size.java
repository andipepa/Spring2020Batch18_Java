package day20_ArraysContinue;

public class Array_size {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4}; //0~3
       // System.out.println(arr1[100]);//arrays size is fixed

        int[] nums =new int[2];


        nums [0] =10;
        nums [1] =20;
        //nums [3] =30; arrays size is fixed 2
        System.out.println(nums[0]); //gives 0 not 10 because is a new one
        System.out.println(nums[1]);

        nums = new int [3]; //its reset now

        System.out.println(nums[0]); //gives 0 not 10 because is a new one
        System.out.println(nums[1]); // 0 again
        System.out.println(nums[2]);
    }

}
