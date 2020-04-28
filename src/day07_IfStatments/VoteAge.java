package day07_IfStatments;

public class VoteAge {
    public static void main(String[] args) {
        int age= 17;
        boolean Uscitizen= true;

        boolean eligible= age>=18 && Uscitizen==true;
        if(eligible){
            System.out.println("You are eligible to vote");
        }
        if(!eligible){
            System.out.println("You are not eligible to vote");
        }
    }
}
/*
write a java program that can identify if a person is eligible
 to vote for Donald Trump
 */