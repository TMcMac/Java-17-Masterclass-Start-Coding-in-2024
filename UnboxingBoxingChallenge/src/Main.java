import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Capitol One");
        bank.addNewCustomer("John Doe", 500.0);
        System.out.println(bank);

        // Test adding transactions to real client
        bank.addTransaction("john doe", 50);
        bank.addTransaction("JOHN DOE", -70.99);
        bank.addTransaction("JoHn DoE", -150);
        bank.printStatement("John Doe");

        // Test adding to non existing client
        // bank.addNewCustomer("Sara Smith", 50.0); // Uncomment to make Sara a real client of the bank
        bank.addTransaction("Sara Smith", 700);
        bank.printStatement("Sara Smith");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialDeposit));
            System.out.println("New customer " + customerName + " added!");
        }
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if(customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer != null) {
            System.out.println("-".repeat(30));
            System.out.println("Customer Name: " + customer.name());
            System.out.println("Transactions: ");
            for (double x : customer.transactions()) {
                System.out.printf("$%10.2f (%s)%n", x, x < 0 ? "debit" : "credit");
            }
        }
    }
}
