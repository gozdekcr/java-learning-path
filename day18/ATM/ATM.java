package day18.ATM;

public class ATM {
    double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws DailyLimitExceededException, InsufficientFundsException, InvalidAmountException {
        if(amount< 0){
            throw new InvalidAmountException();
        }else if(amount>1000){
            throw new DailyLimitExceededException(amount - 1000);
        }else if(amount > balance){
            throw new InsufficientFundsException(amount - balance);
        }
    }
}
