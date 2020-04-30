package day31_Bulkoperations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>();
        list1.add("B");
        list1.add("A");
        list1.add("C");
        list1.add("D");

      boolean r1 =  list1.contains("Z");
        System.out.println(r1);

        ArrayList<String> list2= new ArrayList<>();

        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        Collections.sort(list1); //A,B,C,D
        Collections.sort(list2);//A,B,C,D


      boolean r2 = list1.equals(list2);
        System.out.println(r2);

        System.out.println("===================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(202);
        list3.add(100);
        list3.add(19);

        Collections.sort(list3);

        System.out.println(list3);

        ArrayList<Integer> reversedlist3= new ArrayList<>();


        for(int i= list3.size()-1; i >=0; i--){
            //System.out.print(list3.get(i)+ " ");

            reversedlist3.add(list3.get(i));

        }

        System.out.println(reversedlist3);

        //list3= reversedlist3;

        System.out.println(list3);

        System.out.println(list3.size());

        list3.clear(); //if we clear its empty

       boolean r3= list3.isEmpty(); //false

        System.out.println(r3);


    }
}
