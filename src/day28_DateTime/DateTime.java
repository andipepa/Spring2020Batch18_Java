package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //2020-03-20  11:25:30
        LocalDate date = LocalDate.of(2020, 3, 20);
        LocalTime time = LocalTime.of(11, 25, 30);
        LocalDateTime DateTime = LocalDateTime.of(date, time);
        System.out.println(DateTime);

        LocalDateTime DateTime1 = LocalDateTime.of(2020, 11, 12, 11, 45, 55);
        System.out.println(DateTime1);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM,dd,yyyy");

        LocalDate date2= LocalDate.of(2019,11,21);
        System.out.println(date2.format(dtf));

    }
}