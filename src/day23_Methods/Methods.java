package day23_Methods;

import org.w3c.dom.ls.LSOutput;

/*
Acces-modifier specifier return-type methodName(){
statment }
step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Batch 18
step4: Hello World 5 times
step5: Hello Saim
step6: Hello World 5 Times
 */
public class Methods {

    public static void main(String[] args) {
        System.out.println("Hello Cybertec");
        printHello5();
        System.out.println("Hello Batch18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();
        System.out.println("================================");

        evenNumbers1_100();
        OddNumbers1_100();
    }


    public static void printHello5() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }


    }

    public static void evenNumbers1_100() {

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {

                System.out.println(i + " ");
            }
        }
        System.out.println();
        }

        public static void OddNumbers1_100 () {
            for (int i = 0; i < 101; i++) {
                if (i % 2 != 0) {

                    System.out.println(i + " ");
                }

            }
            System.out.println();
        }

    }




