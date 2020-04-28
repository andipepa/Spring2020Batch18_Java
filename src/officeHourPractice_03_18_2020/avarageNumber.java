package officeHourPractice_03_18_2020;

public class avarageNumber {
    public static void main(String[] args) {

        int [] num={10,11,23,12,14,43,54,65,67};

        int sum= 0;

        for(int i=0; i<num.length; i++) {
            int eachnum = num[i];
            sum += eachnum;
        }
            System.out.println(sum);

        System.out.println("Avarage number: "+ (double)sum/num.length);



    }
}
