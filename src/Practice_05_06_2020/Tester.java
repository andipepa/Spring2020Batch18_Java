package Practice_05_06_2020;

public class Tester {
    String name;
    double employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, double employeeID, String jobTitle, double salary) {

        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+name+",Employee ID: "+employeeID+",Job Title: "+jobTitle+",Salary: "+salary;
    }
    public void smokeTesting(){
        System.out.println(this.name+" is doing smoke testing");
    }
    public void creatingTicket(){
        System.out.println(this.name+" is creating tickets");
    }
}