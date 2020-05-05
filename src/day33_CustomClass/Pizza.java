package day33_CustomClass;
/*
create a custom class for pizza that should contain the following:
                instance variables:
                        size (either small, medium, large)
                        number of cheese topping
                        number of pepperoni toppings
                instance method:
                        customizeOrder(): allows user to set the size and toppisngs of the pizza
                        calcCost(): returns the total cost as double
                        toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
                Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1 per cheese
 */
public class Pizza {
    String pizzaSize;
    int cheeseToppings;
    int pepperoniToppings;

    public void makeOrder (String sizeOfpizza,int numOfChees,int numOfPeperoni){
pizzaSize=sizeOfpizza;
cheeseToppings=numOfChees;
pepperoniToppings=numOfPeperoni;


    }

    public double calCost(){

        if(pizzaSize.equals("small")){
            return(10+1.5*pepperoniToppings+1*cheeseToppings);
        }else if(pizzaSize.equals("medium")){
            return (12+1.5*pepperoniToppings+1*cheeseToppings);
        }else{
            return (14+1.5*pepperoniToppings+1*cheeseToppings);
        }

    }
public String toString(){
        return pizzaSize+" Pizza with  "+ pepperoniToppings+ " Piece of pepperoni and "+ cheeseToppings+
                " Cheese toppings " +"\n Your total price is $"+calCost();
}

}
