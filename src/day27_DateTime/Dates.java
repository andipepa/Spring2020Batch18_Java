package day27_DateTime;


import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1= LocalDate.of(2020,10,25) ;

        System.out.println(date1);

        LocalDate birthday= LocalDate.of(2020,12,25);

        //isAfter(date2)
        boolean result1= date1.isAfter(birthday);
        System.out.println(result1);

        boolean result2= date1.equals(birthday);
        System.out.println(result2);

        System.out.println("===============================");

        LocalDate now=LocalDate.now();
        System.out.println("Today is: "+now);

        LocalDate MyBirthday= LocalDate.of(1987,11,19);
        System.out.println("Today is my birthday: "+ MyBirthday);

        System.out.println("===============================");



    }
}
