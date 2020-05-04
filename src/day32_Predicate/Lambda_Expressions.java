package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x-> x % 2 !=0;

        ArrayList<Integer> list= new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list.removeIf(oddNumber);
        System.out.println(list);

        System.out.println("======================================");

        Predicate<Integer> lessthen5 = y-> y<5;

        ArrayList<Integer> list1= new ArrayList<>();

        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list1.removeIf(lessthen5);
        System.out.println(list1);

        System.out.println("================================");

        Predicate<String> stratswithM= x->  x.startsWith("M");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Andi","Murat","Muhtar","Ali"));

        names.removeIf(stratswithM);
        System.out.println(names);

        System.out.println("=================================================");

///if name starts with M and A
        Predicate<String> SMA= x-> x.startsWith("M")|| x.startsWith("A");

        ArrayList<String> namelist = new ArrayList<>();

        namelist.addAll(Arrays.asList("Andi","Murat","Muhtar","Ali","Asiya","Nora"));

        namelist.removeIf(SMA);
        System.out.println(namelist);



    }
}
