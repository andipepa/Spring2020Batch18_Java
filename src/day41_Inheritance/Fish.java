package day41_Inheritance;

public class Fish extends Annimal {

    public void swim(){
        System.out.println(name+" is swiming");
    }



    public static void main(String[] args) {
        Fish fish1=new Fish();
        fish1.name="Nemo";
        fish1.weight=1.5;
        fish1.size="small";
        fish1.swim();
        fish1.move();
        fish1.eat();

    }

}
