package day16_ForLoop;
/*
3. write a program that can calculate the sum of
 all the even numbers between 1 ~ 100
	4. write a program that can calculate the sum of
	 all the odd numbers between 1 ~ 100;

 */
public class calculateSumof100 {
    public static void main(String[] args) {
        int sum=0;
        int sum1= 0;

        for(int i =0 ; i<=100; i++){

            if(i% 2==0){
                sum +=i;
            }else{
                sum1+=i;
            }

        }
        System.out.println("sum of all even numbers is:"+sum);
        System.out.println("sum of all odd numbers is:"+sum1);



    }
}
