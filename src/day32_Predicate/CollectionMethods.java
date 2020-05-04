package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class CollectionMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8));

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */

        System.out.println("===============================================");

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,8,8));

        int minNum =   Collections.min(list1);  //to find the second min num
        list1.removeAll(Arrays.asList(minNum));

        int minSecond=Collections.min(list1);
        System.out.println(minSecond);

        System.out.println("=====================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,8,8));

        int maxNum =   Collections.max(list2);  //to find the second max num
        list2.removeAll(Arrays.asList(maxNum));

        int maxSecond=Collections.max(list2);
        System.out.println(maxSecond);
        System.out.println("=======================================");

        ArrayList<Integer> list3= new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,4,5)); //i want to switch position of 1 and 5 we take the index

        Collections.swap(list3,0,4);
        System.out.println(list3);

        Collections.replaceAll(list3,3,10);
        System.out.println(list3);


        System.out.println("=============================================");
        ArrayList<String> names= new ArrayList<>();

        names.addAll(Arrays.asList("Andi","Esat","Andi","Irina","Muhtar"));

        Collections.replaceAll(names,"Andi","Nora");
        System.out.println(names);


    }

}
