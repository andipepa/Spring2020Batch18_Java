package day41_Inheritance.Task2;
/*
create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
 */
public class BankAccount {
    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void deposit(int amount){
        balance+=amount;
    }
    public void showBalance(){
        System.out.println("Avaliable balance: "+balance);

    }
    public String toString(){
        return "Account holder: "+accountHolder+", Balance: "+balance;
    }

}
