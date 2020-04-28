package officeHourPractice_03_18_2020;

import java.text.DecimalFormat;

public class formatdecimal {
    public static void main(String[] args) {
        DecimalFormat Df= new DecimalFormat();

        double a= 5.0/3.0;
        System.out.println(a);
        System.out.println( Df.format(a));

    }
}
