package day33_CustomClass;

public class Capital1 {
    public static void main(String[] args) {

        BankAccount Andi = new BankAccount();
        Andi.accountHolder= "Andi";
        Andi.accountNumber=123456789;

        Andi.checkingBalance();
        Andi.deposit(0);
        Andi.withDraw(800);
        Andi.checkingBalance();

        System.out.println("====================================================================");





    }
}
