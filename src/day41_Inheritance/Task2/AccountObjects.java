package day41_Inheritance.Task2;

public class AccountObjects {
    public static void main(String[] args) {
        CheckingAccount obj= new CheckingAccount();
        obj.accountHolder="Andi";
        System.out.println(obj);
        obj.deposit(345);

        obj.withdraw(43);
        obj.showBalance();

        System.out.println("==============================");

        SavingAccount saving= new SavingAccount();
        saving.accountHolder="Ella";
        saving.deposit(5678);

        System.out.println(saving.interestRate);

        System.out.println(saving);

    }
}
