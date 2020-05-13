package day37_Constractor;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    /*
    1. create a custom class for pizza that should contain the following:
                instance variables:
                        size (either small, medium, large)
                        number of cheese topping
                        number of pepperoni toppings
                Add a constructor that can allow user to set the size and toppisngs of the pizza
                instance method:
                        calcCost(): returns the total cost as double
                        toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
                Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

     */
    String size;
    int numCheese;
    int numPepperoni;

    public Pizza(String size, int numCheese,int numPepperoni){
        this.size=size;
        this.numCheese=numCheese;
        this.numPepperoni=numPepperoni;


    }
    public double calcost(){
        double totalCost=0;
        if(size.equals("small")){
            totalCost= (10+1.5*numPepperoni+1*numCheese);
        }else if(size.equals("medium")){
            totalCost= (12+1.5*numPepperoni+1*numCheese);
        }else {
            totalCost= (14+1.5*numPepperoni+1*numCheese);
        }
        return totalCost;
    }
    public String toString(){
        return size+" Pizza with "+numPepperoni+" pepperoni toppings"+numCheese+" cheese toppings ";
    }
}class Order{
    public static void main(String[] args) {
        Pizza order1= new Pizza("Small",2,1);
        Pizza order2= new Pizza("Medium",3,2);
        Pizza order3= new Pizza("Large",5,4);
        Pizza order4= new Pizza("Medium",3,3);
        Pizza order5= new Pizza("Small",5,4);

        ArrayList<Pizza> list=new ArrayList<>();
        list.addAll(Arrays.asList(order1,order2,order3,order4,order5));
double TotalCost=0;
        for(Pizza each : list){
           TotalCost+=each.calcost();
            System.out.println(each);
        }
        System.out.println("You have to pay: "+TotalCost);
    }
}
