package day02_Variables;

public class variablespractices {
    public static void main(String[] args) {
        /*
        salary,tax,tax rate, loan, ssn
         */
        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;
//salary after tax = salary(1-sum of taxes)
        double sumTaxes = federalTax + stateTax;
        double salaryAfterTax = salary * (1 - sumTaxes);
        System.out.println(salaryAfterTax);
        System.out.println("==============================");

        // area of the circle = r * r * pi
        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println(area);
        System.out.println("===============================");
        int kg = 60;
        double pound = kg * 2.25;
        System.out.println(pound);
        System.out.println("====================================");
double lira = 1000;
double liraToDollar = lira / 6.15;
        System.out.println(liraToDollar);
        double lek = 100000;
        double lektodollar = lek * 0.012;
        System.out.println(lektodollar);
        System.out.println("===========================");
        double liter = 10000;
        double galons = 3.7;
        double litretogallon = liter / 3.7;
        System.out.println(litretogallon);
        System.out.println("=====================================");
        double Kg= 22;
        double KgTopounds=Kg*2.20462;
        System.out.println(KgTopounds);

        double Litre= 33;
        double LitreToGallons= Litre*0.264;
        System.out.println(LitreToGallons);
        double Gallon= 23;
        double GallonToLitres= Gallon*3.785;
        System.out.println(GallonToLitres);
        double Lira= 33;
        double LiraToDollar= Lira/6.45;
        System.out.println(LiraToDollar);
        double r1 = 8.7;
        double area1= r1*r1*3.14;
        System.out.println(area1);
        double l1= 13;
        double w1= 34;
        double area2=l1*w1;
        System.out.println(area2);
    }
}


