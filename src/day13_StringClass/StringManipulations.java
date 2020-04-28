package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str= "Cybertek";
                   //01234567
      char ch1=  str.charAt(5);//gives letter t
        System.out.println(ch1=='A'); //false

        int totalLength =  str.length(); //gives how many characters
        System.out.println(totalLength);
        System.out.println(totalLength> 200); //false

        String str2 ="today is a beautiful day, and we are having fun";
          int maxindex  =str2.length()-1;
        System.out.println(maxindex);

       String s1= "Cybertek";
       s1= s1.concat(" school"); //"Cybertek school"
        System.out.println(s1);

        String s2= "Java";
        s2= s2.concat(" is a programin language");

        System.out.println(s2);
        System.out.println("===========================");

        String name = "CYBERTEK";
          name= name.toLowerCase();
        System.out.println(name);

        String name1= "cybertek school";
        name1 = name1.toUpperCase();
        System.out.println(name1);

        String A1= "       Today is a good day      "; //trim removes unnecesery spaces
        A1= A1.trim();
        System.out.println(A1);

    }
}
