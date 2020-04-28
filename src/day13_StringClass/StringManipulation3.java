package day13_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {

        String str = "I like Java programing";
        int num1= str.indexOf("J");
        System.out.println(num1);
String num2= "Cybertek school is the best";
int firstS= num2.indexOf("s");
int secondS=num2.indexOf("is")+1;
int third= num2.indexOf("best")+2;
        System.out.println(firstS);
        System.out.println(secondS);
        System.out.println(third);

String fullname= "Andi Pepa";
String firstname= fullname.substring(0, fullname.indexOf(" "));
String lastname= fullname.substring(fullname.indexOf(" ")+1);

        System.out.println(firstname);
        System.out.println(lastname);
    }
}
