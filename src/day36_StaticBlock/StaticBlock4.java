package day36_StaticBlock;

import officeHours.Practice_05_06_2020.Tester;

public class StaticBlock4 {

    static String name;
    static Tester tester1=new Tester();

    static {
        //gets executed first and accepts only static variables

        name="Cybertek School";
        tester1.setTesterInfo("Andi",123,"QA",120000);

    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);
    }

}
