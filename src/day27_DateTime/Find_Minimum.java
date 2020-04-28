package day27_DateTime;

public class Find_Minimum {
    public static void main(String[] args) {
      int[] arr= {5,4,7,8,9};
      int minimum = arr[0];
for(int each: arr){
    if(each<minimum){
        minimum=each;
    }
}

        System.out.println(minimum);

    int []arr2={67,87,32,12,43,56,432,};
    double[]arr3={4.5,6.7,32,45,12,8.1};

        System.out.println(minNumber(arr3));

    }

    public static int minNumber(int[] arr){

        int minimum = arr[0];
        for(int each: arr){
            if(each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }
public static double minNumber(double[]arr){

    double minimum = arr[0];
    for(double each: arr){
        if(each<minimum){
            minimum=each;
        }
    }
    return minimum;
}



}
