package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        EmployeeInfo Eysan= new EmployeeInfo();

        Eysan.setAddress("38 Raymond st");
        Eysan.setSalary(120000);


        System.out.println(Eysan.getAddress());
        System.out.println(Eysan.getSalary());


    }
}
