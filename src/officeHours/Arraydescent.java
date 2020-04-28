package officeHours;

import java.util.Arrays;

public class Arraydescent {
    public static void main(String[] args) {
        int [] nums={0,7,4,3,6,7,2,1,-6,-5,};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int [] desc= new int[nums.length];

       int j =0;

        for(int i =nums.length-1; i>=0; i-- ){
            desc[j]= nums[i];

            j++;
        }

        System.out.println(Arrays.toString(desc));
    }
}
