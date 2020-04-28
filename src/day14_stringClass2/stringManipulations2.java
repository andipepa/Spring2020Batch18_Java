package day14_stringClass2;

public class stringManipulations2 {
    public static void main(String[] args) {
        String str= "";
         boolean bool1=str.isEmpty();// true

        String username="";

        if(username.isEmpty()){
            System.out.println("please provide a user name");
        }

        String z1="Tiger";
        String z2=new String("Tiger");
        String z3="Tiger";

        System.out.println(z1==z2);//false
        System.out.println(z2==z3);//false
        System.out.println(z1==z3);//true

        //equals(): it checks the value if its same or no
        System.out.println(z1.equals(z2)); //true
        System.out.println(z2.equals(z3));//true
        System.out.println(z1.equals(z3));//true
/*
userName: cybertek
passWord: cybertekschool
 */


    }
}
