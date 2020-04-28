package day14_stringClass2;

public class string_manipulations {
    public static void main(String[] args) {
        String str = "I like to learn Java.I like to watch the movie Jumanji";

       int a1= str.indexOf("J");
        System.out.println(a1);

       int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3 =str.indexOf(" I")+1; //second I index
        System.out.println(a3);

        String s= "I like Java, and I like reading";

        int b1= s.lastIndexOf("I");
        System.out.println(b1);

        int b2= s.lastIndexOf("l");
        System.out.println(b2);

        String z= "I like C#, C# is cool"; //to find first C indexof
                                           // to find last C lastindexof

        int c1= z.indexOf("C");
        int c2= z.lastIndexOf("C");
        System.out.println(c1);
        System.out.println(c2);

        String x= "I like Java, Java is fun, Java programming id fun";
        int d= x.indexOf("J"); //first J
        int d1=x.indexOf("Java is"); //second J
        int d2=x.lastIndexOf("J"); //last J
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);


        char ch1= x.charAt(26);
        System.out.println(ch1);

    }
}
