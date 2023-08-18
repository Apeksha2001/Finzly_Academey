/*Encapsulation and Access Control: You are designing a banking application. Create a class BankAccount with private properties
like accountNumber, balance, and ownerName. Provide public methods for depositing, withdrawing, and getting the balance. Implement
 encapsulation by restricting direct access to the properties and using public methods to interact with them.*/

package JBKTest1;
class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

//    public BankAccount(String accountNumber, double initialBalance, String ownerName) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//        this.ownerName = ownerName;
//    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to " + ownerName + "'s account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + ownerName + "'s account.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
       // BankAccount account = new BankAccount("123456789", 1000.0, "John Doe");
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        account.setOwnerName("Apeksha");
        account.setAccountNumber("12345678");
//
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getOwnerName());

        account.deposit(500.0);
        account.withdraw(200.0);

        double balance = account.getBalance();
        System.out.println("Current balance: " + balance);

    }
}

