package day39_AccessModifiers;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        System.out.println(car1);

        Car car2= new Car("Tesla","Roadster");
        System.out.println(car2);

        Car car3 = new Car("Tesla","Roadster",2020);
        System.out.println(car3);

        Car car4 = new Car("Tesla","Roadster",2020,60000);
        System.out.println(car4);
    }
}
