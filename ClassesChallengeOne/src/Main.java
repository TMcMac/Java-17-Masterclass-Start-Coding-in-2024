public class Main {
    public static void main(String[] args) {
        // Create new account
        BankAccount timsAccount = new BankAccount();

        // Add funds
        timsAccount.depositFunds(10000.0);
        // Withdraw funds
        timsAccount.withdrawFunds(1000.0);
        // Over draw account
        timsAccount.withdrawFunds(10000);
        // Zero out account
        timsAccount.withdrawFunds(9000);
    }
}
