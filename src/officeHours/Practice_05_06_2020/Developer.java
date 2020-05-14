package officeHours.Practice_05_06_2020;

public class Developer {
    String name;
    String jobTitle;
    double emplyeeId;
    double salary;

    public void setDeveloperInfo(String name,String jobTitle,double emplyeeId,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.emplyeeId=emplyeeId;
        this.salary=salary;

    }
    public String toString(){
        return "Name: "+name+",Job Title: "+jobTitle+
                ",Emplyee ID: "+emplyeeId+",Salary: "+salary;
    }
    public void coding(String program){
        System.out.println(name+" is coding"+program);
    }
    public void fixingBugs(){
        System.out.println(name+" is fixing bugs");
    }

}
