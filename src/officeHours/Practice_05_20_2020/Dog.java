package officeHours.Practice_05_20_2020;

public class Dog extends Pet{
    /*
    custom class: pet
 variables:  name(inherited)
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

            bark
     */

    public Dog(String name, int age, String color, String size, String breed){
        setInfo(name,age, color, size,breed);
    }

    public void bark(){
        System.out.println(name+ " is barking");
    }
}
