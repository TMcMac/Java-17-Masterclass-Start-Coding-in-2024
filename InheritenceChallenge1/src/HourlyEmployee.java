public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String dateOfBirth,
                          String endDate, String hireDate,
                          long employeeID, double hourlyPayRate) {
        super(name, dateOfBirth, endDate, hireDate, employeeID);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * this.hourlyPayRate;
    }
}
