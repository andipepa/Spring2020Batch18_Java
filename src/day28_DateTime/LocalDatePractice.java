package day28_DateTime;

import java.time.LocalDate;

public class LocalDatePractice {
    /*
    Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
 */

    public static void main(String[] args) {

        String [] arr={"Andi","John","Geri"};

        LocalDate AndisBirthday= LocalDate.of(1987,11,19);
        LocalDate JohnsBirthday= LocalDate.of(1989,06,29);
        LocalDate GeriBirthday= LocalDate.of(2007,1,11);

LocalDate[] birthdays={AndisBirthday,JohnsBirthday,GeriBirthday};

for( int i=0;i<arr.length;i++) {
    String name = arr[i];
    LocalDate bd = birthdays[i];

    System.out.println(name + "'s birthday is " + bd);


}

    }




}
