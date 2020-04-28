package day21_avaragenumbers_Arrays;
/*
warmup tasks:
	1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10

	3. write a program that can return the shortest string of text from an array
 */
public class AvarageNumber {
    public static void main(String[] args) {
     int [] arr= {10,20,30,40,50,70,90,60,100,54,65,78,45,65,32,12,34,54}; //avarage ;sum of all/ length

     int sum=0;
      for(int i=0; i<arr.length; i++){
        int  eachnum = arr[i];
        sum +=eachnum;
      }

        System.out.println(sum);
        System.out.println((double) sum/arr.length);

    }
}
