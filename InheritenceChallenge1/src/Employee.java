public class Employee extends Worker{
    private String hireDate;
    private long employeeID;


    public Employee(String name, String dateOfBirth, String endDate, String hireDate, long employeeID) {
        super(name, dateOfBirth, endDate);
        this.hireDate = hireDate;
        this.employeeID = employeeID;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }
}
