package day39_AccessModifiers;

public class Employee {
    String name;
    String jobTitle;
    int id;
    double salary;
    char gender;

    public Employee(String name){
        this.name=name;
    }
    public Employee(String name,String jobTitle){
        this(name);
        this.jobTitle=jobTitle;
    }
    public Employee(String name, String jobTitle, int id){
        this(name,jobTitle);
        this.id=id;
    }
    public Employee(String name,String jobTitle,int id,double salary){
        this(name,jobTitle,id);
        this.salary=salary;
    }
    public Employee(String name,String jobTitle,int id,double salary,char gender){
        this(name,jobTitle,id,salary);
        this.gender=gender;
    }
    public String toString(){
        return "Name: "+name+"\nJob Title: "+jobTitle+"\nID: "+id+
                "\nSalary: "+salary+"\nGender: "+gender;
    }
}
