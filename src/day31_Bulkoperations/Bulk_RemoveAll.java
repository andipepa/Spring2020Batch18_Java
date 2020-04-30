package day31_Bulkoperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        //remove 1 2 3 4
/*
        Integer a=1;
        list.remove(a); //its gonna remove 1

        Integer b=2;
        list.remove(b);
        System.out.println(list);
*/

Integer[] arr={1,2,3,4};

list.removeAll(Arrays.asList(arr));

        System.out.println(list);

        System.out.println("============================");

        String [] names= {"Ahmet","Mehmet","Ali","Ahmet"};

        ArrayList<String> namelist= new ArrayList<>(Arrays.asList(names));
        System.out.println(namelist);
namelist.removeAll(Arrays.asList("Ahmet"));
        System.out.println(namelist);
    }
}
