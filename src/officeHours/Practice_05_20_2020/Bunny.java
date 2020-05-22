package officeHours.Practice_05_20_2020;

public class Bunny extends Pet {
    /*
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

            dig

     */
    public Bunny(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size,breed);

    }
    public void dig(){
        System.out.println(name+" is digging");
    }
}
