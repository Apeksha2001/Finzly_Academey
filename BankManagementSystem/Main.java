package BankManagementSystem;

public class Main{
    public static void main(String args[]){
        SavingsAccount savingAccount=new SavingsAccount("1234","Apeksha",2000,2);
        System.out.println("Saving Account Details");
        System.out.println(savingAccount.getAccountNumber());
        System.out.println(savingAccount.getAccountHolderName());
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.deposit(2000));
        savingAccount.withdraw(1000);
        System.out.println();
        CheckingAccount chekingAccount=new CheckingAccount("5678","Sita",4000,1000);

        System.out.println("Checking Account Details");
        System.out.println(chekingAccount.getAccountNumber());
        System.out.println(chekingAccount.getAccountHolderName());
        System.out.println(chekingAccount.getBalance());
        System.out.println(chekingAccount.deposit(3000));
        chekingAccount.withdraw(800);


    }

}