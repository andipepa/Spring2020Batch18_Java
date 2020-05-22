package officeHours.Practice_05_20_2020;


public class AnnimalKingdom {
    public static void main(String[] args) {
        Dog dog1= new Dog("James",3,"Grey","Big","Husky");
        System.out.println(dog1);
        Dog dog2= new Dog("Lake",4,"Red","Small","Shiwawa");
        System.out.println(dog2);

        dog2.bark();

        System.out.println("=========================================================");

        Cat cat1= new Cat("Leyla",2, "black","small","Scotish");
        System.out.println(cat1);

        cat1.scratch();

        System.out.println("==============================================================");

        Bunny bunny1= new Bunny("Lucy",5,"White","Small","Wild");
        System.out.println(bunny1);

        bunny1.dig();

    }
}
