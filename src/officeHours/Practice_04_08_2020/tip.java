package officeHours.Practice_04_08_2020;
import java.util.*;
public class tip {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Split:");
        String spilt =input.nextLine();
        System.out.println("Number of people:");
        int ppl = input.nextInt();
        System.out.println("Check amount:");
        double ca = input.nextDouble();
        System.out.println("Service Quality:");
        String Quality=input.next();
        String result=(ppl==1)?"&":(ppl==2)?"&&":(ppl==3)?"&&&"
                :(ppl==4)?"&&&&":"&&&&&";

        System.out.println("Number of people entered: "+result);
        double totaltip=0;
        if (Quality.equalsIgnoreCase("Poor")){
            totaltip=ca*0.05;
        }else if (Quality.equalsIgnoreCase("Fair")){
            totaltip=ca*0.10;
        }else if (Quality.equalsIgnoreCase("Good")){
            totaltip=ca*0.15;
        }else if(Quality.equalsIgnoreCase("Great")){
            totaltip=ca*0.20;
        }else{
            totaltip=ca*0.25;
        }

        System.out.println("Total to pay: "+(ca+totaltip));
        System.out.println("Total tip: "+totaltip);
        System.out.println("Total per person: "+(ca+totaltip)/ppl);
        System.out.println("Tip per person: "+totaltip/ppl);






    }
}
