package day40_Encapsulation;

public class Test {
    public static void main(String[] args) {
        Encapsulation obj= new Encapsulation();

        System.out.println(obj.getSSN());//0 isnt set yet

        obj.setSSN(123456);
        System.out.println(obj.getSSN());

    }
}
