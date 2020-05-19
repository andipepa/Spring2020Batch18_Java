package day40_Encapsulation;

public class Credentials {
   private String usernaem;
   private double pasword;

   public String getUsernaem(){
       return usernaem;
   }
   public void setUsernaem(String usernaem){
       this.usernaem=usernaem;

   }
   public double getPasword(){
       return pasword;
   }
   public void setPasword(double pasword){
       this.pasword=pasword;
   }

}
