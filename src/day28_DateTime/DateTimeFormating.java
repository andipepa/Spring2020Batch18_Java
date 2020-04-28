package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormating {
    public static void main(String[] args) {
        LocalDateTime datetime1= LocalDateTime.of(2015,12,23,11,30,45);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        System.out.println(datetime1.format(dtf));


    }
}
