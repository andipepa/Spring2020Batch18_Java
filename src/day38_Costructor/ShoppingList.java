package day38_Costructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        Item item1=new Item("Watermelon",2,1);
        Item item2=new Item("Peach",1,3);
        Item item3=new Item("Apple",1.5,5);
        Item item4=new Item("Soda",2,1);
        Item item5=new Item("Milk",2.5,2);

        ArrayList<Item> list= new ArrayList<>();
       list.addAll(Arrays.asList(item1,item2,item3,item4,item5));

       double totalCost=0;

       for (Item each: list){

           totalCost+=each.calCost();


       }

       for(int i=0; i<list.size();i++) {

         totalCost+=  list.get(i).calCost();

       }
        System.out.println("Total cost: $"+totalCost);
    }
}
