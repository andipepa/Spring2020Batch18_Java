package officeHours.Practice_05_20_2020;

public class Cat extends Pet {
    /*
    Cat:
       name(inherited)
             age, (inherited)
             color,(inherited)
             size, (inherited)
             breed,(inherited)
             isPet,(inherited)
             numberOfeyes (inherited)
            methods:
            eat, (inherited)
            sleep,(inherited)
            drink,(inherited)
            toString (inherited)

            scratch
     */

    public Cat(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size,breed);

    }

    public void scratch(){
        System.out.println(name+ " is scratching");
    }
}
