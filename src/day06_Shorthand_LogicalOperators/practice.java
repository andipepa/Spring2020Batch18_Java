package day06_Shorthand_LogicalOperators;

public class practice {
    public static void main(String[] args) {
        // 1$= 120lek
        //grocery 15000lek
        //rent 20000lek
        //bills 5000lek
        //spends 10000
        //salary 80000
        double dolar= 10000;
        double lektodollar= dolar/120;
        System.out.println(lektodollar);
        double monthlyGrocery= 15000;
        double monthlyRent= 20000;
        double monthlyBills= 5000;
        double monthlySpends=10000;
        double monthlySalary=80000;
        double monthlyTotalspends= monthlySpends+monthlyBills+monthlyGrocery+monthlyRent;
        double monthlyrestindollar= (monthlySalary-monthlyTotalspends)/120;
        System.out.println(monthlyTotalspends);
        System.out.println(monthlyrestindollar);
        System.out.println("=============================");

        int a=20;
        int b=20;
        boolean aGreater=a>b;
        boolean bGreater=b>a;
        boolean aEqualb= a==b;
        if(aEqualb){
            System.out.println(a+ " is equal "+b);
            double x=200;
            double y=400;
            x+=23;
            y-=56;

            System.out.println(++x + --x * --y - y); //224 223 343 343

        }




    }
}
