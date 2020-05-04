package day33_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.Brand="BMW";
        car1.Model="X6";
        car1.Color="Black";
        car1.year=2020;

        System.out.println(car1.Brand);
        System.out.println(car1.Model);
        System.out.println(car1.Color);
        System.out.println(car1.year);

        System.out.println("============================================");

        Car car2= new Car();

        car2.Brand="Toyota";
        car2.Model="Prius";
        car2.Color="White";
        car2.year=2020;


        System.out.println(car2.Brand);
        System.out.println(car2.Model);
        System.out.println(car2.Color);
        System.out.println(car2.year);

        car1.start();
        car2.drive();

        car1.getCarInfo();
        car2.getCarInfo();

        System.out.println("================================================");

        Car car3= new Car();

        car3.Brand = "Mercedes";
        car3.Model="MayBach";
        car3.Color="Black";
        car3.year=2020;

        car3.getCarInfo();


    }
}
