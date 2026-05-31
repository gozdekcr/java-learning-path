package day18.BankAccount;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(double amount) {
        super("Insufficient funds! Missing amount: " + amount);
    }
}
