package day34_CustomClass2;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {

        Carpet [] carpets={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()} ;
        carpets[0].customOrder(4,5,25,true);
        carpets[1].customOrder(5,3,42,false);
        carpets[2].customOrder(3,6,65,true);
        carpets[3].customOrder(5,6,32,false);
        carpets[4].customOrder(6,8,43,true);

        ArrayList<Carpet> persianCarpets= new ArrayList<>();

        for(Carpet eachCarpet : carpets){
            if(eachCarpet.isPersian) {
                persianCarpets.add(eachCarpet);
            }
        }

        System.out.println("There are "+persianCarpets.size()+" Persian carpets");

        System.out.println("First carpet:\n"+persianCarpets.get(0).calcCost());


        ArrayList<Carpet> regularCarpets=new ArrayList<>(Arrays.asList(carpets));

        regularCarpets.removeAll(persianCarpets);
        System.out.println("There are "+regularCarpets.size()+" regular carpets");

        for(int i =0; i<regularCarpets.size();i++){
            System.out.println(regularCarpets.get(i).calcCost());
        }




    }
}
