package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {
        int[] arr1={5,6,4,2,9,8,3};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("min is: "+ arr1[0]);
        System.out.println("max number is: "+arr1[arr1.length -1]);

char[] ch = {'z','b', 'a', 'e'};
Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String [] names= {"Ali", "Esat","Andi","Bahri", "Muhtar", "Halil"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//sorts by alfabetic

        System.out.println("=======================================");

        int [] arr = {3,1,5,2,-8,67,45};
        Arrays.sort(arr);//sort in desnt order/ters
        int[] arrDesc = new int[arr.length];

        System.out.println(Arrays.toString(arr));
int j= 0;

for(int i =arr.length-1; i>=0; i--){
   // System.out.print(arr[i]+ ", ");

    arrDesc[j]=arr[i];

    j++;

}
        System.out.println(Arrays.toString(arrDesc));

    }
}
