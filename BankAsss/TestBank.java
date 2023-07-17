package BankAsss;



import java.util.Date;

import BankAsss.Bank.InsufficientBalanceException;

public class TestBank {
	public static void main(String[] args) {
       
        Account account1 = new SavingsAccount("abc132", new Date(), 100.0, 500.0, 2);
        Account account2 = new CurrentAccount("xyz243", new Date(), 1000.0, -5000.0);

        
        Bank bank = new Bank("Axis Bank", "Hyd Branch");

        
        bank.addAccount(account1);
        bank.addAccount(account2);

       
        System.out.println("All Accounts that are created");
        bank.showAccounts();
        System.out.println();

        
        System.out.println("Transactions:");
        PerformTrans(bank, account1, 'd', 2000.0);
        PerformTrans(bank, account1, 'w', 100.0);
        PerformTrans(bank, account2, 'd', 5000.0);
        PerformTrans(bank, account2, 'w', 15000.0);
    }

    private static void PerformTrans(Bank bank, Account account, char ttype, double amount) {
        String accountType = (account instanceof SavingsAccount) ? "Savings Account" : "Current Account";
        String transactionType = (ttype == 'd' || ttype == 'D') ? "Deposit" : "Withdrawal";

        System.out.println("Account No: " + account.getAccountNo());
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: " + amount);

        try {
            bank.transaction(ttype, account.getAccountNo(), amount);
            System.out.println("Transaction Successful");
            System.out.println("Updated Balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        System.out.println("*********************");
    }
}
