package day19_arrays;

public class arrays_practice1 {
    public static void main(String[] args) {

        String[] friend={"yucel","esat","phu","selcuk","rahman"};
        //String friend1= classmates[2];
        //System.out.println(friend1);

        for(int i=0; i<5; i++){
            String name= friend[i];
            System.out.print(name+" ");

        }

        String [] emails={"cybertek@yahoo.com","cybertek@hotmail.com","cybertek@gmail.com","cybertek@outlook.com" };
        //print all users with @gmail.com
        //max;4 right now

        for(int i=0; i<=emails.length-1; i++){
            String email= emails[i];
            if(email.endsWith("@gmail.com")){
                System.out.println(email);
            }
        }

    }
}
