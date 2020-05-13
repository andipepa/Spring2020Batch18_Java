package day38_Costructor;

public class EmployeeSalary {
    public static void main(String[] args) {

        SalaryCalculater Andi= new SalaryCalculater(65,40,0.04,0.21);
        SalaryCalculater Esat= new SalaryCalculater(50,40,0.05,0.21);
        SalaryCalculater Muhtar= new SalaryCalculater(65,40,0.03,0.21);
        SalaryCalculater Nora= new SalaryCalculater(55,40,0.04,0.21);

        System.out.println(Andi);
    }
}
