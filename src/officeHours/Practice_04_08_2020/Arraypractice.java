package officeHours.Practice_04_08_2020;

import java.util.Arrays;

public class Arraypractice {
    public static void main(String[] args) {

        int [] num1={1,2,3};
        int [] num2={4,5,6};
        int [] num3= new int[  num1.length+num2.length] ;

        for(int i=0; i<=num1.length-1;i++){
            num3[i]=num1[i];

        }
        for(int i =0; i<=num2.length-1;i++){
            num3[num1.length+i]=num2[i];
        }
        System.out.println(Arrays.toString(num3));

    }
}
