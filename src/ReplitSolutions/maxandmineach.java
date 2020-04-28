package ReplitSolutions;

public class maxandmineach {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7};

        MaxAndmin(arr);
    }


    public static void MaxAndmin (int[] arr){
        int max= arr[0];
        int min= arr[0];

        for( int each:arr){
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }


        }
        System.out.print(max);

        System.out.println();

        System.out.print(min);

    }


}
