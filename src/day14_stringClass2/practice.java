package day14_stringClass2;

public class practice {
    public static void main(String[] args) {

        String gmail = "andipepa87.ap@gmail.com";


        String userinputGmail = "Andipepa87.ap@gmail.com";

        //boolean result= gmail.equals(userinputGmail); false
        boolean result= gmail.equalsIgnoreCase(userinputGmail); //true

        if(result){
            System.out.println("Log in");
        }
        String r = "Cybertek school";
     boolean r1  = r.contains("school"); //true

        System.out.println(r1);

        System.out.println("================================");

        /*
        valid pasword MUST contain special character such as (!,_,$)
        valid pasword shouldnt contain space
         */

        String pasword = "mmas d123";
       boolean n=pasword.contains(" ");
if(n){
    System.out.println("valid");
}else{
    System.out.println("invalid");
}

        System.out.println("================================");

String webAddress = "WWW.amazon.com";
webAddress=webAddress.toLowerCase();


 if(webAddress.startsWith("www")){
     System.out.println("valid");
 }else{
     System.out.println("invalid");
 }

        System.out.println("============================");

 String email = "CybertekSchool@gmail.com";

 if(email.endsWith("@gmail.com")){
     System.out.println("valid");
 }else{
     System.out.println("invalid");
 }


    }
}
