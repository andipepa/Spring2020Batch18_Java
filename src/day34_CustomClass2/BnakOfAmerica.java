package day34_CustomClass2;

import java.util.ArrayList;
import java.util.Arrays;

public class BnakOfAmerica {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setTesterInfo("Andi",12345678,"QA",120000);

        Tester tester2=new Tester();
        tester2.setTesterInfo("Phu",43222111,"Senior SDET",130000);

        Tester tester3=new Tester();
        tester3.setTesterInfo("Esat",857333,"SDET",110000);

        Tester tester4=new Tester();
        tester4.setTesterInfo("Aylin",373626,"Manual Tester",120000);

        Tester tester5=new Tester();
        tester5.setTesterInfo("Nel",73635,"Cook",60000);

        ArrayList<Tester> testers=new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

        testers.removeIf(p -> p.jobTitle.contains("SDET"));

        double totalBudget=0;
        for ( Tester each : testers ){

            System.out.println(each);
            totalBudget+=each.salary;
        }
        System.out.println(totalBudget);
    }
}
