package day35_Static;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFulltime;

    public void setOfferInfo(String location,String company,double salary,boolean isFulltime){

        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isFulltime=isFulltime;

    }
    public String toString(){
        return "Location is: "+location+", Company: "+company+", Salary: $"+salary+", Fulltime: "+isFulltime;

    }
}
