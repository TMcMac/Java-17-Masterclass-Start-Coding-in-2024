import java.util.ArrayList;

public class Branch {
    // write code here
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialDeposit) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        Customer newCustomer = new Customer(name, initialDeposit);
        customers.add(newCustomer);
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer theCustomer = findCustomer(name);
        if (theCustomer != null) {
            theCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }
}