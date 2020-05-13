package day37_Constractor;

public class ConstructorIntro {

  //  public method(){ //constructor name must be same with class name

    public ConstructorIntro(int a){

        System.out.println("Cunstructor with argument of int");

    }

    public static void main(String[] args) {
       // ConstructorIntro obj= new ConstructorIntro();//object must be created with existin constructor

   ConstructorIntro obj2 = new ConstructorIntro(10);

    }
}
