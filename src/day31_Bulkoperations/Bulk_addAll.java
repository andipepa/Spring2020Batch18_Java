package day31_Bulkoperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        //add 30,20,40,50,60

      /*  list1.add(30);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);  */



      Integer [] arr1= {10,30,55,32,67}; //anotherway to add

      list1.addAll(Arrays.asList(30,20,40,50,60));

        System.out.println(list1);
        System.out.println(Arrays.asList(arr1));


        System.out.println("================================");

        String [] names={"Andi","Ali","Osman","Esat"};

        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList = new ArrayList<>();

        nameList.addAll(Arrays.asList(names));

nameList.add("Kevin");
nameList.remove("Andi");

        System.out.println(nameList);

        System.out.println("===============================");

        Integer[] num={1,2,3,4,5,6,7,8};
//////another way to add
        ArrayList<Integer> numlist= new ArrayList<>(Arrays.asList(num));

        System.out.println(numlist);

    }

}
