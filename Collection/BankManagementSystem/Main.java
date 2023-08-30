package Collection.BankManagementSystem;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //HashMap<Integer,BankAccount> bankAccounts =new HashMap<>();
        HashSet<BankAccount> bankAccounts=new HashSet<>();          //used for avoid duplication
        int choice;

        do {
            System.out.println("------Bank--------");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
            case 1:

                System.out.println("Enter account number: ");
                int accountNumber = scanner.nextInt();

                System.out.println("Enter account holder name: ");
                String accountHolder = scanner.next();

                System.out.println("Enter balance: ");
                double  balance = scanner.nextDouble();

                BankAccount addAccount = new BankAccount(accountNumber, accountHolder, balance);
                if(bankAccounts.add(addAccount)){
                    System.out.println("Account created successfully");
                }
                else {
                    System.out.println("Account number is not unique");
                }
//                bankAccounts.put(accountNumber, account1);
//                System.out.println("Account created successfully.");
                break;

            case 2:

                System.out.println("---Deposit Amount--- ");
                System.out.println("Enter account number: ");
                accountNumber = scanner.nextInt();

                BankAccount accountToDeposite=null;
                for(BankAccount account:bankAccounts){
                    if(account.getAccountNumber()==accountNumber){
                        accountToDeposite=account; //if accountNumber is valid then object gets assigned to check
                        break;
                    }
                }
                if(accountToDeposite != null){
                    System.out.println("Enter amount for deposit:");
                    double amount=scanner.nextDouble();
                    accountToDeposite.deposit(amount);
                }else {
                    System.out.println("Invalid account number");
                }

//                BankAccount account= bankAccounts.get(accountNumber);
//                if(account != null){
//                    System.out.println("Enter amount for deposit:");
//                    double amount=scanner.nextDouble();
//                    account.deposit(amount);
//                }else {
//                    System.out.println("Invalid account number");
//                }

                break;

            case 3:
                System.out.println("---Withdraw Amount--- ");
                System.out.println("Enter account number: ");
                accountNumber = scanner.nextInt();

                BankAccount accountToWithdraw=null;
                for(BankAccount account:bankAccounts){
                    if(account.getAccountNumber()==accountNumber){
                        accountToWithdraw=account; //if accountNumber is valid then object gets assigned to check
                        break;
                    }
                }
                if(accountToWithdraw != null){
                    System.out.println("Enter amount for deposit:");
                    double amount=scanner.nextDouble();
                    accountToWithdraw.withdraw(amount);
                }else {
                    System.out.println("Invalid account number");
                }
                break;



//                 account= bankAccounts.get(accountNumber); //get method check is account prsent or not if not then assigned null to account
//                if(account != null){
//                    System.out.println("Enter amount for withdraw:");
//                    double amount=scanner.nextDouble();
//
//                    account.withdraw(amount);
//                }else {
//                    System.out.println("Invalid account number");
//                }
//



            case 4:
                System.out.print("--Check Balance--");
                System.out.println("Enter account number: ");
                accountNumber = scanner.nextInt();

                BankAccount accountToCheck=null;
                for(BankAccount account:bankAccounts){
                    if(account.getAccountNumber()==accountNumber){
                        accountToCheck=account; //if accountNumber is valid then object gets assigned to check
                        break;
                    }
                }
                if(accountToCheck != null){
                    accountToCheck.getBalance();
                }else {
                    System.out.println("Invalid account number");
                }
                break;

//                System.out.println("Enter account number: ");
//                accountNumber = scanner.nextInt();;
//                account = bankAccounts.get(accountNumber);
//                if (account != null) {
//                    System.out.println(account);
//                    account.getBalance();
//                } else {
//                    System.out.println("Account not found.");
//                }
//                break;

            case 5:
                System.out.println("List of all accounts:");
                for (BankAccount allBankaccount : bankAccounts) {
                    System.out.println(allBankaccount);
                }
                break;

            case 6:
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }while (choice !=6);
}
}
