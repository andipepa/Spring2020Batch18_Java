package day33_CustomClass;

public class Carpet {
    int width, length;
    boolean isPersian;
    double unitprice;

    public void customOrder(int width, int length, boolean isPersian, double unitprice) {
        this.width = width;
        this.length = length;
        this.isPersian = isPersian;
        this.unitprice = unitprice;

    }

    public double calCost() {
       double totalPrice=(width*length)*unitprice;
       if(isPersian==true){
           totalPrice+=200;
       }
       return totalPrice;
        }
    public String toString(){
        return "Carpet is "+width+"m wide " +"\nCarpet is " + length+"m long "+"\nUnit price is: " + unitprice+ "\nTotal price: $"+ calCost();
    }

        }
