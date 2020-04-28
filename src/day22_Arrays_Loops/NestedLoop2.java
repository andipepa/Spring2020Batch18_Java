package day22_Arrays_Loops;

public class NestedLoop2 {
    public static void main(String[] args) {

        int [][] numbers = {{6,7,3,2,1},{6},{8,6,5,4,1,9}};

        for(int j =0; j <numbers.length; j++){


        for(int i=0; i <numbers[j].length; i++) {

            System.out.print(numbers[j][i]+" ");

        }
            System.out.println();
        }
//print 123766914568

        for( int j=0;  j<numbers.length; j++){

            for(int i= numbers[j].length-1; i>=0; i--){

                System.out.print(numbers[j][i]+ " ");
            }

        }
        System.out.println();
for( int j=numbers.length-1; j >=0; j--){

    for(int i=0; i < numbers[j].length; i++){

        System.out.print(numbers[j][i]+" ");
    }



}




    }
}
