package day19_arrays;

public class arrays_practice2 {
    public static void main(String[] args) {
        int[] arr= {10,20,30};
        System.out.println(arr.length);//3

        int[] arr2= new int[5];  //max index 4
        System.out.println(arr2[0]); //without value it alays give 0

        String[]  testers = new String[3];//there are 3 positions empty

        //index; 0,1,2           // im gonna stroe 3 names here

        testers[0]= "Reem";
        testers[1]= "Andi";
        testers[2]= "Esat";

        System.out.println(testers[0]);
        System.out.println(testers[1]);
        System.out.println(testers[2]);

        System.out.println("=====================================");

        String [] stds =new String[10];
        //write a program ask a name 10 times.
        stds[0]="Andi";
        stds[1]="esat";


    }
}
