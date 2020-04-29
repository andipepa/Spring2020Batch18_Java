package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

       // list.remove(1);
       boolean r1= list.remove("B");//true
        System.out.println(list);
        System.out.println(r1);


    }
}
