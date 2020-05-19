package day42_Inheritance;
/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
 */
public class Student extends Person{

    /*
    name (inherited)
     age(inherited)
     gender(inherited)
     studentID
     clazz
     schoolName=cybertek
     setStudentInfo(inherited)
     toString(inherited)
     eat(inherited)
   sleep(inherited)
   walk(inherited)
   drink(inherited)

     attendClass
     code

     */

    public long studentID;
    public String clazz;
    public static String schoolName="Cybertek";

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz){
        setPersonInfo(name,age,gender);
        this.studentID=studentID;
        this.clazz=clazz;
    }
    public void attendClass(){
        System.out.println(name+" is attending "+clazz);
    }
    public void code(){
        System.out.println(name+ " is coding");
    }
    public String toString(){
        return "Student name: "+name+"\nAge: "+age+"\nGender: "+gender
                +"\nStuden ID: "+studentID+"\nClass: "+clazz;
    }
}
