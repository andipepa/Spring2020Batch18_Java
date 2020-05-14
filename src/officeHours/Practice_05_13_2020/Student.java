package officeHours.Practice_05_13_2020;

public class Student {
   String name;
    int id;
    static String schoolName="Cybertek";

    public String toString(){
        return "Name: "+name+", ID: "+id+", School name: "+schoolName;
    }
}

class studentObject{
    public static void main(String[] args) {
        Student student1= new Student();
        student1.name="Medina";
        student1.id=123;

        Student student2= new Student();
        student2.name= "Ali";
        student2.id=135;

        System.out.println(student1);
        System.out.println(student2);

    }

}