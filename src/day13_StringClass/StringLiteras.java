package day13_StringClass;

import org.w3c.dom.ls.LSOutput;

public class StringLiteras {
    public static void main(String[] args) {


        String str1 = "Cat";
        String str2 = new String("cat");
        System.out.println(str1+" : "+str2); //cat : cat
        System.out.println(str1==str2); //false

        String str3 = "Cat";
        System.out.println(str1==str3);// true

        String str4= new String("cat");
        System.out.println(str2==str4);// false

        String s1 = "java";
        s1 = "JavaScript";
        System.out.println(s1); //JavaScript

        String s2= "Java"; //no new object will be created its already there

        System.out.println(s1==s2); //false s1 reprsent javascript now




    }
}