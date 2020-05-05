package day34_CustomClass2;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost(){
        double total = (width*length)*unitPrice;
        if(isPersian){

            return total+200;
        }else {
            return total;
        }
        // return (isPersian) ? total+200 : total;
    }

    public void customOrder(double carpetWidth,double carpetLength,double carpetunitPrice,boolean carpetPersian){

        width=carpetWidth;
        length=carpetLength;
        unitPrice=carpetunitPrice;
        isPersian=carpetPersian;

    }
public String toString(){ //its gonna return whtever you write here at objects

        return "Width: "+width +"\nLength: "+length+"\nUnitprice: $"+unitPrice+
                "\nCost: $"+calcCost();

}

}
