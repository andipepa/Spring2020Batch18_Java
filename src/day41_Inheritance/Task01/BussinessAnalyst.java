package day41_Inheritance.Task01;

public class BussinessAnalyst extends Employee {
    /*
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all
     		the attributes of businessAnalyst
     */
    public BussinessAnalyst(String name,double salary, long id, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;

    }


    public void writingReq(){
        System.out.println(name+" is writing requairments");

    }
    public void gathering(){
        System.out.println(name+" is gathering requairments");
    }


}
