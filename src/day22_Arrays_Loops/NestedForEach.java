package day22_Arrays_Loops;

public class NestedForEach {
    public static void main(String[] args) {

        int [][]  arr2D= {{1,2,3},{4,5,6,7}};

        for(int[ ] each1Darray:arr2D){
            for( int eachelement : each1Darray){

                System.out.print(eachelement+" ");
            }

        }
        System.out.println();
        System.out.println("=============================");

        char [][] ch2D= {{'a','b','c'},{'d','e','f'}};

        for( char[] each1Darray : ch2D){

            for(char eachElement : each1Darray){

                System.out.print(eachElement+ " ");



            }

        }
        System.out.println();

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21} };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number

        int countOdd=0;
        int sumofeven=0;
        int sumofodd=0;
        for( int[] each1DArray : numbers){
            for( int eachElement : each1DArray){
                if (eachElement %2==0){
                    System.out.print(eachElement+ " ");

                    sumofeven+=eachElement;

                }else{

                sumofodd+=eachElement;
            countOdd++;
                }
            }
        }
        System.out.println();
        System.out.println(countOdd);
        System.out.println("Sum of even is: "+sumofeven);
        System.out.println("Sum of odd is: "+sumofodd);


    }
}
