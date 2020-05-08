package day35_Static;

public class StudentObject {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.name="Andi";
        System.out.println(student1);

        Student student2= new Student();
        student2.name="Nora";
        System.out.println(student2);

     Student.printSchoolName();

    }
}
