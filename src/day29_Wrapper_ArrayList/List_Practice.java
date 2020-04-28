package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<String> shoppinglist = new ArrayList<>();
        shoppinglist.add("Milk");
        shoppinglist.add("Coffee");
        shoppinglist.add("Bread");
        shoppinglist.add("Toilet Paper");
        shoppinglist.add("eggs");
        System.out.println(shoppinglist);

        for(int i=0; i<shoppinglist.size();i++){
            System.out.println(shoppinglist.get(i));
        }
        System.out.println("=============================");

        for(String each : shoppinglist){

            System.out.println(each);

        }


        int size= shoppinglist.size();
        System.out.println(size);

        int lastindex= shoppinglist.size()-1;
        System.out.println(lastindex);


       /* System.out.println(shoppinglist.get(0));
        System.out.println(shoppinglist.get(1));
        System.out.println(shoppinglist.get(2));
        System.out.println(shoppinglist.get(3));
                                               */

    }
}
