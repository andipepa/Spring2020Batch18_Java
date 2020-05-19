package day40_Encapsulation;

public class Person {
   public String name;

   private String country;
   private double salary;
   private String email;
   private int SNN;

   public String getCountry(){
       return country;
   }
   public void setCountry(String country){
       this.country=country;
   }

public double getSalary(){
       return salary;
}
public void setSalary(double salary){
       this.salary=salary;
}
public String getEmail(){
       return email;
}
public void setEmail(String email){
       this.email=email;
}
public int getSNN(){
       return SNN;
}
public void setSNN(int SNN){
       this.SNN=SNN;
}
}
