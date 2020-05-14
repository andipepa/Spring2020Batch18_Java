package day39_AccessModifiers;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1= new Employee("Andi");
        System.out.println(employee1);
        System.out.println();

        Employee employee2= new Employee("Linda","QA");
        System.out.println(employee2);
        System.out.println();

        Employee employee3= new Employee("John","SDET",123);
        System.out.println(employee3);
        System.out.println();

        Employee employee4= new Employee("Ali","Developer",134,120000);
        System.out.println(employee4);
        System.out.println();

        Employee employee5= new Employee("Nora","Tester",135,120000,'F');
        System.out.println(employee5);
    }
}
