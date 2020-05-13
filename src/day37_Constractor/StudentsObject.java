package day37_Constractor;

public class StudentsObject {
    public static void main(String[] args) {
        Student student1= new Student("Marina", 34, 'F', "Cybertek");
        ///student1.setInfo("Marina", 34, 'F', "Cybertek");
        System.out.println(student1);

        Student student2= new Student("Andi",21,'M',"Albanian University");
        System.out.println(student2);
    }
}
