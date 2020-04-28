package ReplitSolutions;

public class max_minNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,11,23,24,43,54,34,};

        int maxNum=arr [0];
        int minNum=arr [0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxNum){
                maxNum=arr[i];
            }
            if(arr[i]<minNum){
                minNum=arr[i];
            }
        }
        System.out.println(maxNum);
        System.out.println(minNum);

    }
}
