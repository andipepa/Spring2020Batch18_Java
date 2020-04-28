package day07_IfStatments;

public class ValidTriangle {
    public static void main(String[] args) {
        double angle1=60;
        double angle2=50;
        double angle3=60;
        double SumOfangles= angle1+angle2+angle3;

        boolean ValidTriangle= SumOfangles ==180;
        if(ValidTriangle){
            System.out.println(" the shape is a triangle");
        }
        if(!ValidTriangle){
            System.out.println(" the shape is not a triangle");
        }
    }
}
/*
1. A triangle is valid if the sum of all the three angles is equal to
180 degrees. Write a program that declares three integers as angles and
check whether a triangle is valid or not
 */