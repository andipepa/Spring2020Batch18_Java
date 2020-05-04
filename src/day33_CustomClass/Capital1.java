package day33_CustomClass;

public class Capital1 {
    public static void main(String[] args) {

        BankAccount Andi = new BankAccount();
        Andi.accountHolder= "Andi";
        Andi.accountNumber=123456789;

        Andi.checkingBalance();
        Andi.deposit(345);
        Andi.withDraw(400);
        Andi.checkingBalance();

        System.out.println("====================================================================");

        System.out.println(Andi);



    }
}
