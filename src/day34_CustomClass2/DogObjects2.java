package day34_CustomClass2;

public class DogObjects2 {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.setDogInfo("Husky","Small","Red",5,"Bobi");

        Dog dog2= new Dog();
        dog2.setDogInfo("PitBull","Big","Black",7,"Qamil");

        Dog dog3=new Dog();
        dog3.setDogInfo("Poodle","Small","White",3,"LuLu");

        Dog dog4= new Dog();
        dog4.setDogInfo("Kangal","Big","Orange",2,"Bella");


        dog1.eating("Chicken");
        dog2.drinking("Beer");
        dog1.playing("Piano");

        System.out.println("======================================================");

        Dog [] dogPark = {dog1,dog1,dog3,dog4};

        for (int i=0; i<dogPark.length;i++){
            dogPark[i].eating("Chicken");
        }

        for(Dog eachdog : dogPark){
            eachdog.drinking("Wiski");
        }
        for (int i=0; i<dogPark.length;i++) {
            dogPark[i].playing("Jaz");
        }
        for(Dog eachdog : dogPark) {
            eachdog.studying("Java");
        }
    }
}
