package day18.ATM;

public class InvalidAmountException extends Exception {
    
    public InvalidAmountException() {
        super("Amount cannot be negative!");
    }
}
