package Collection.BankManagementSystem;

public abstract class Bank {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Bank(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract int getAccountNumber();
    public abstract String  getAccountHolderName();
    public abstract void  getBalance();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);


}
