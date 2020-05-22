package day43_MethodOverriding;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle1= new Circle(3);
        System.out.println(circle1.radius);

        circle1.calculateArea(); //bug
        circle1.calculatePerimeter();//bug

        System.out.println("=============================");

        Rectangle rec1= new Rectangle(3,4);

        System.out.println(rec1.length);
        System.out.println(rec1.width);

        rec1.calculateArea(); //bug
        rec1.calculatePerimeter(); //bug

        System.out.println("===================================");

        Square square1= new Square(3);
        System.out.println(square1.side);

        square1.calculateArea();//bug
        square1.calculatePerimeter();//bug

    }
}
