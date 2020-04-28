package officeHours;
import java.util.Scanner;
public class swapnames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if(email.contains("_")) {
            int emailindex = email.indexOf("@");
            System.out.println(emailindex);
            String emailindex1 = email.substring(0, 9);
            System.out.println(emailindex1);
            int first = emailindex1.indexOf("_");
            System.out.println(first);
            String firstpart = emailindex1.substring(0, first);
            String secondpart = emailindex1.substring(first + 1);
            System.out.println(secondpart+"_"+firstpart+email.substring(emailindex));

        }else{
            System.out.println(email);
        }

    }
}
