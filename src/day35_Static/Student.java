package day35_Static;

public class Student {

    String name;
    int id;
    double gpa;
   static String Schoolname="Cybertek";


   public void setInfo(String name,int id,double gpa){ //if we use any instance method shouldnt be static

       this.name=name;
       this.gpa=gpa;
       this.id=id;

   }
   public static void printSchoolName(){
       System.out.println("School name is: "+Schoolname);
   }
   public String toString(){
      return "Name: "+name+", School name: "+Schoolname;
}

}
