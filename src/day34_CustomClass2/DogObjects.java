package day34_CustomClass2;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1= new Dog();

        dog1.setDogInfo("Husky","Small","Red",5,"Bobi");

       /*
        Dog dog1= new Dog();
        dog1.breed="Husky";
        dog1.size="Small";
        dog1.color="White";
        dog1.name="Bobi";
        dog1.age=3;
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);*/

       Dog dog2= new Dog();
       dog2.setDogInfo("PitBull","Big","Black",7,"Qamil");

       Dog dog3=new Dog();
       dog3.setDogInfo("Shiwawa","Small","White",3,"LuLu");

       Dog dog4= new Dog();
       dog4.setDogInfo("Pomerian","Small","Orange",2,"Bella");


        System.out.println(dog1);
        System.out.println();
        System.out.println(dog2);
        System.out.println();
        System.out.println(dog3);

        System.out.println("==========================================================");

        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1,dog2,dog3,dog4));

        for( int i=0;i<puppies.size();i++){
          Dog eachDog=  puppies.get(i);

            System.out.println(eachDog);
        }
        System.out.println("============================================");

        puppies.removeIf( p -> p.age > 4);   //i want to hold only dogs that are little than 3 years

        for(int i = 0; i < puppies.size(); i++ ){
            Dog eachdog  = puppies.get(i);
            System.out.println( eachdog );
        }


    }
}
