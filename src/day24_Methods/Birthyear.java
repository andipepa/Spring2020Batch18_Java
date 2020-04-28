package day24_Methods;

public class Birthyear {

    public static void Age (int bithYear){
        int currentyear=2020;

        int age=currentyear-bithYear;

        if(bithYear<currentyear){
            System.out.println(age);

        }else{
            System.out.println("Wait to be born first");
        }



        System.out.println("Your age is: "+age);

    }

    public static void main(String[] args) {
        int a = 1987;

      //  Age(1987);
        printHelloCybertek();//hello cybertek



    }

    public static void printHello(){

        System.out.println("Hello");
    }
    public static void printCybertek(){

        System.out.println("Cybertek");
    }

    public static void printHelloCybertek (){

        printHello(); //hello
        printCybertek();//cybertek

    }



}
