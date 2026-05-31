package day18.BankAccount;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(600);
            System.out.println("Transaction successful.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }
}
