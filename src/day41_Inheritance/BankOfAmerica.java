package day41_Inheritance;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount Andi= new BankAccount("Andi","Pepa");

        System.out.println(Andi.getAccountHolder());
        System.out.println(Andi.getBalance());
        Andi.chekBalance();
        Andi.depositing(230);
        Andi.chekBalance();
        Andi.withdrawing(135);
        Andi.chekBalance();

        System.out.println(Andi);
    }

}
