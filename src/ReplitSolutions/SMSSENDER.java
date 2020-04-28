package ReplitSolutions;
import java.util.*;
public class SMSSENDER {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String message = scan.nextLine();
            /*
            Sender:<Mike Smith>. From Number:[202-123-3456].
             Message:{I love programing and problem solving}
             */



            String sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
            String phoneNumber= message.substring(message.indexOf("[")+1,message.indexOf("]"));
            String messageBody= message.substring(message.indexOf("{")+1,message.indexOf("}"));

            System.out.println("Sender: "+sender);
            System.out.println("Phone Number: "+phoneNumber);
            System.out.println("Message body: "+messageBody);
        }
    }


