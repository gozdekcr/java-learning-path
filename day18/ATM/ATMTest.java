package day18.ATM;

public class ATMTest {
    public static void main(String[] args) {
        ATM atm1 = new ATM(500);

        try {
            atm1.withdraw(700);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (DailyLimitExceededException e) {
            System.out.println(e.getMessage());
        } catch ( InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("ATM operation completed.");
        }
    }
}
