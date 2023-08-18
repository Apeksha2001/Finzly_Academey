package BankManagementSystem;

public class SavingsAccount extends BankAccount{
    double interestRate;
    public SavingsAccount(String accountNumber,String accountHolderName,double balance,double interestRate){

        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    @Override
    public String  getAccountNumber() {
        return "Account number is : "+accountNumber;
    }

    @Override
    public String  getAccountHolderName() {
        return "Account holder name is: "+accountHolderName;
    }

    @Override
    public String  getBalance() {
        return "Account balance is: "+balance;
    }

    @Override
    public String deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        return "After depositing "+amount+" balance is"+balance;
    }
    @Override
    public double withdraw(double amount) {
        if (amount > 0&& amount <= balance) {
            balance = balance - amount;
        }
        System.out.println("After Withdrawing  "+amount+" balance is"+balance);
        return 0;
    }
}