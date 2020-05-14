package day36_StaticBlock;

import officeHours.Practice_05_06_2020.Tester;

public class StaticBlock2 {

    static int a;
    static int b;
    int c;

    static Tester tester1=new Tester();

    static {
        a=100;
        b=200;
        //c=1000; static only accepts static

        if(100>200){
            a=100;
        }else{
            b=200;
        }

    }

}
