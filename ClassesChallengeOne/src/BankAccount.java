import java.math.BigDecimal;

public class BankAccount {
    // This is out bank account class which will have attributes of an account, part 79 of the course


    // Attributes
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    // Getters and Setters for each field
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // Deposit funds into the account
    public void depositFunds(double deposit) {
        this.accountBalance += deposit;
        System.out.println("Deposit of $" + deposit + " made. New balance $" + this.accountBalance);
    }
    // Withdrawing funds from the account
    public void withdrawFunds(double withdraw) {
        if(withdraw > this.accountBalance) {
            System.out.println("Insufficient funds. You only have: $" + this.accountBalance);
        } else {
            this.accountBalance -= withdraw;
            System.out.println("Withdraw of $" + withdraw + " made. New balance $" + this.accountBalance);
        }
    }
}
