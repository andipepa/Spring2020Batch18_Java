package day33_CustomClass;

public class CarObjects2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("BMW","X6",2020,"Red");
        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Merceds","Evo",2019,"White");
        car2.getCarInfo();

        Car car3 = new Car();
        car3.setCarInfo("Audi","Q5",2018,"Grey");
        car3.getCarInfo();

        Car car4 = new Car();
        car4.setCarInfo("Ford","Mustang",1967,"Red");
        car4.getCarInfo();

        System.out.println("===========================================");

        Car[] cars={car1,car2,car3,car4};

        for(int i = 0; i< cars.length; i++){
            cars[i].getCarInfo();
        }
        System.out.println("===================================================");

        for(Car eachCar : cars){

            eachCar.getCarInfo();

        }
        System.out.println("==============================");

        System.out.println(car1); //i can print this because i added toString at Car class



    }

}
