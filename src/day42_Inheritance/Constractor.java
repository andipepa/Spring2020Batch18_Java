package day42_Inheritance;
class test{

public test(){
    System.out.println("Super clas default constractor");

}

}

public class Constractor extends test {

    public Constractor(){
        System.out.println("Sub clas default constractor");
    }

    public static void main(String[] args) {
        Constractor obj= new Constractor();

       // test obj1= new test(); //super class can never call sub class
    }
}
