package BankManagementSystem;

public class CheckingAccount extends BankAccount{
protected double overdraftLimit;

public CheckingAccount(String accountNumber,String accountHolderName,double balance,  double overdraftLimit) {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.overdraftLimit = overdraftLimit;
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
        if (amount > 0 && balance-amount> -overdraftLimit) {
        balance = balance - amount;
        System.out.println("After withdrawing "+amount+" balance is: "+balance);

        }else{
        System.out.println("Insufficient balance ");
        }

        return 0;

        }
        }