package day38_Costructor;

public class CircleObjects {
    public static void main(String[] args) {
       double r=3;

       Circle circle1= new Circle(r);

       double areaOfCircle= circle1.area();
        System.out.println(areaOfCircle);

        System.out.println("Diameter is: "+circle1.diameter);
        System.out.println("Perimeter is: "+circle1.perimeter());




    }
}
