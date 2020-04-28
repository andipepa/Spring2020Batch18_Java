package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
////you wanna add an element at a specific place
        list1.add(1,6);//add index 1 number 6
        list1.add(4,7);

        list1.set( 3, 7); //so index 3 is changed from 8 to 7


        System.out.println(list1);

        ArrayList<String> list2= new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");

        list2.set(2,"F");
        list2.set(3,"E");

        System.out.println(list2);

        System.out.println("=====================================");
ArrayList<Integer> list3= new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

       // int a= 1; //remove index 1
        Integer a1= 4;//this removes number one


        //list3.remove(3); //so you remove index 3
       boolean r1= list3.remove(a1);
        //list3.remove(a);

        System.out.println(list3);
        System.out.println(r1);


    }
}
