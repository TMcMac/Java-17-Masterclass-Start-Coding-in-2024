import java.util.ArrayList;

public class Customer {
    // write code here
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>(1000);

    public Customer(String name, double initialDeposit) {
        this.name = name;
        addTransaction(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}