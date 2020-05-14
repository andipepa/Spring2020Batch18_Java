package officeHours.Practice_04_08_2020;
import java.util.Scanner;
public class printhalf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String half= word.substring(0,word.length()/2);
        half+= half;
        System.out.println(half);
    }
}
