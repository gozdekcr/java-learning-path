package day18.ATM;

public class DailyLimitExceededException extends Exception {
    
    public DailyLimitExceededException(double amount) {
        super("ATM's daily withdraw limit is 1000.0 and you cannot exceed this amount. Excess amount: " + amount);
    }
}
