package Collection.BankManagementSystem;

import java.util.Objects;

public class BankAccount extends Bank {


    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public void getBalance() {
        System.out.println("Balance: "+balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount>0){
            balance +=amount;
            System.out.println(amount+" Deposited Successfully");
            System.out.println("Balance After deposite: "+balance);
        }
        else {
            System.out.println("Enter Valid Amount");
        }

    }

    @Override
    public void withdraw(double amount) {
        if(balance>=amount)
        {
            if(amount>0){
                balance -=amount;
                System.out.println(amount+" Withdrawal Successfully");
                System.out.println("Balance after withdrawal: "+balance);
            }else{
                System.out.println("Enter valid amount");
            }

        }else {
            System.out.println("Insufficient balance");
        }

    }

    @Override
    public String toString() {
        return "BankManagementSystem{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }


}
