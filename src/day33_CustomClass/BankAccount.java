package day33_CustomClass;
/*
practice task:
    create a custom class for bank account
      attrubutes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
 */
public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Avaliable Balance: "+ balance);
    }
    public void withDraw(double amount){
        System.out.println("Withdrawing $"+ amount);
        balance-=amount;
    }
    public void deposit (double amount){
        System.out.println("Depositing $"+amount);
        balance+=amount;
    }
    public String toString(){
        String result="Account holder: "+ accountHolder+ "\nAccount Number: "+accountNumber+"\nAvaliable Balance: "+balance;
        return result;
    }

}
