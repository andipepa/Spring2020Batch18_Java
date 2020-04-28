package day21_avaragenumbers_Arrays;

public class emails {
    public static void main(String[] args) {
        String [] emails= {"Cybertek@gmail.com","Cybertek@hotmail.com","Cybertek@yahoo.com","Cybertek@outlook.com"};

        for (String EachEmail : emails){
            if(!EachEmail.endsWith("@gmail.com")){
                System.out.println(EachEmail);

            }

        }



    }
}
