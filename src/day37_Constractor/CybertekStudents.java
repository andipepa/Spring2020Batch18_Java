package day37_Constractor;

public class CybertekStudents {

   static String schoolName;
   String studentName;
   int groupNumber;
   String batch;
   public CybertekStudents(String studentName,int groupNumber, String batch){
schoolName="Cybertek";
       this.batch=batch;
       this.groupNumber=groupNumber;
       this.studentName=studentName;
   }


public String toString(){
       return "Name: "+studentName+", Batch: "+batch+", in group: "
               +groupNumber+", School name: "+schoolName;
}


}
class Cobjects{
    public static void main(String[] args) {
        CybertekStudents student1= new CybertekStudents("Andi",15,"Batch18");
        System.out.println(student1);
        CybertekStudents student2= new CybertekStudents("Ali",13,"Batch18");
        System.out.println(student2);
    }
}
