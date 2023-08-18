package BankManagementSystem;

public abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public abstract String getAccountNumber();
    public abstract String  getAccountHolderName();
    public abstract String  getBalance();
    public abstract String deposit(double amount);
    public abstract double withdraw(double amount);


}