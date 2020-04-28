package day14_stringClass2;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str1= "CYBERTEK";
        String str2= "cybertek";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str2.equalsIgnoreCase(str2));

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



    }
}
