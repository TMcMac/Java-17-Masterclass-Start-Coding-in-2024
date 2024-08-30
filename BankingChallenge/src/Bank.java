import java.util.ArrayList;


public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches = new ArrayList<>(100);

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            Branch newBranch = new Branch(name);
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialDeposit) {
        Branch theBranch = findBranch(branchName);
        if (theBranch == null) {
            return false;
        }

        return theBranch.newCustomer(customerName, initialDeposit);
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch theBranch = findBranch(branchName);
        if (theBranch != null) {
            return (theBranch.addCustomerTransaction(customerName, transaction));
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean listTransactions) {
        Branch theBranch = findBranch(branchName);

        if (theBranch != null) {
            System.out.println("Customer details for branch " + theBranch.getName());
            ArrayList<Customer> theCustomers = theBranch.getCustomers();

            int i = 1;

            for (Customer customer : theCustomers) {
                int j = 1;
                System.out.printf("Customer: %s[%d]%n", customer.getName(), i);
                if (listTransactions == true) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (Double transaction : transactions) {
                        System.out.printf("[%d] Amount %.2f%n", j, transaction);
                        j++;
                    }
                }
                i++;
            }
            return true;
        }
        return false;
    }
}
