package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {
        Person andi= new Person();
        andi.name="Andi";
        System.out.println(andi.name);

        //andi.getCountry();
        andi.setCountry("Albania");
        System.out.println(andi.getCountry());

        andi.setEmail("andipepa@hotmail.com");
        System.out.println(andi.getEmail());

        andi.setSalary(120000);
        System.out.println(andi.getSalary());

        andi.setSNN(2345676);
        System.out.println(andi.getSNN());
    }
}
