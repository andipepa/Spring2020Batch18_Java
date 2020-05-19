package day41_Inheritance.Task01;

public class EmployeeObjects {
    /*
    create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the
     		 attributes of businessAnalyst
     */
    public static void main(String[] args) {
        Developer dev1= new Developer(120000,"Andi",123,"Developer",'M');
        dev1.fixingBug();
        dev1.coding();

        System.out.println(dev1);

        Tester tester1= new Tester("Jane",130000,135,"SDET",'F');

        tester1.reporting();
        tester1.testing();
        System.out.println(tester1);

        BussinessAnalyst BA1=new BussinessAnalyst("Jhon",110000,136,"BA",'M');

        BA1.gathering();
        BA1.writingReq();
        System.out.println(BA1);
    }
}
