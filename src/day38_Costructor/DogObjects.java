package day38_Costructor;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        System.out.println("Dog1: "+dog1);

        Dog dog2= new Dog("Husky");
        System.out.println("Dog2: "+dog2);

        Dog dog3= new Dog("Poddle",2);
        System.out.println(dog3);


        ///so whichever you call that will execute
    }

}
