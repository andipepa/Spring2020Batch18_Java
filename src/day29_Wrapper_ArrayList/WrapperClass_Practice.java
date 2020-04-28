package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {

        double[] arr={1,2,3.4,5.6,7,1.6,8};

        double max= Double.MIN_VALUE;

        for(double each:arr){

            if(each>max){
                max=each;
            }
        }
        System.out.println(max);
        System.out.println("=====================================");

        String [] arr2= {"1","2","3.4","5.3","6.5"};
        double[] numbers= new double[arr2.length];

        for(int i=0; i<arr2.length; i++) {
            numbers[i] = Double.parseDouble(arr2[i]);
        }
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length-1]);

    }
}
