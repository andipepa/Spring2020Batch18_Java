package day31_Bulkoperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_retainAll {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list.retainAll(Arrays.asList(1,3,5,7,9)); //keeps what you want

        System.out.println(list);


    }
}