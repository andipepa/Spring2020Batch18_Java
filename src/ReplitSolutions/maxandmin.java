package ReplitSolutions;
/*
4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */


public class maxandmin {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};

        MaxAndMin(arr);
    }



    public static void MaxAndMin(int[]arr ){


        int max = arr[0];
        int min= arr[0];

        for(int i=0; i<arr.length;i++ ){
            if(arr[i]>=max){
                max=arr[i];
            }

            if(arr[i]<=min){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
