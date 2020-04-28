package day27_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_Formating {
    public static void main(String[] args) {

        //day_month_year


        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date1= LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        creat a date called bithDay: month/days/year; ex: 2020.04.23==Apr/23/20
         */

        DateTimeFormatter brth= DateTimeFormatter.ofPattern("EEEE/MMMM/yy");

        LocalDate birthDay= LocalDate.of(2020,04,23);
        System.out.println(birthDay.format(brth));

        LocalDate date3=LocalDate.now();
        System.out.println(date3.format(brth));
        LocalTime tim=LocalTime.now();
        System.out.println(tim);

    }


}
