package Day4_javaRecap;

public class warmUp {
    public static void main(String[] args) {
        short year=2020;
        //leapYear: year % 4==0
        //if it turns true ==>leapYear if it turns false ==>not leapyear

        boolean leapyear= year%4==0;
        System.out.println(year+" is leap year: " +leapyear);
        String result = year + " is leap year :" + leapyear;
        System.out.println(result);

        System.out.println("65 is an even numer :"+(65%2==0));
        System.out.println("65 is an even number :"+(65%3==0));
        System.out.println("65 is an even number :"+(65%5==0));


    }
}
