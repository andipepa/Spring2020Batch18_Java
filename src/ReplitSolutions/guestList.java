package ReplitSolutions;
import java.util.Scanner;
public class guestList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String totalList = " ";

        while (true) {
            System.out.println("Enter your guests name");
            String guestName=input.next();
            totalList+=guestName+", ";

            System.out.println("Do you want to enter another guest");
            String answer=input.next();
            if(answer.equals("no")){
                System.out.println("Your guests list is: "+totalList.substring(0,totalList.length()-2));
           break;

            }

        }

    }

}
