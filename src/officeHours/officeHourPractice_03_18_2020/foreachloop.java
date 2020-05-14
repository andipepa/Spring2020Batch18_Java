package officeHours.officeHourPractice_03_18_2020;

public class foreachloop {
    public static void main(String[] args) {
        String sentence= "andi,esat,bahri,halil,sulo";

        String [] name= sentence.split(",");

        for(String eachname:name){
            System.out.println(eachname);



        }
int[] nums={1,3,2,4,5,6,7,8,9};
        for(int eachnum:nums){
            if(eachnum<4)
            continue;
            System.out.println(eachnum);
        }


        }

    }

