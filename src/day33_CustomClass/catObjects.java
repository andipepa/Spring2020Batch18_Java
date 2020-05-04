package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setCatInfo("Bengal","Orange","Sissi",12);
       // System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.setCatInfo("Albanian","Red and Black","Zuzu",11);
       // System.out.println(cat2);

        Cat cat3= new Cat();
        cat3.setCatInfo("Calico","Yellow","Bobi",2);

        ArrayList<Cat> catlist= new ArrayList<>();
        catlist.addAll(Arrays.asList(cat1,cat2,cat3));

        for (int i =0; i<catlist.size(); i++){

            System.out.println(catlist.get(i));

        }
        System.out.println("==================================");

        cat1.sleep();
        cat2.drink(" Milk");
        cat3.eat(" Fish");

    }
}
