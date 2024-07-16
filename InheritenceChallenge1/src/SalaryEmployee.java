import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class SalaryEmployee extends Employee{
    private double annualSalary;

    private boolean isRetired;

    public SalaryEmployee(String name, String dateOfBirth,
                          String endDate, String hireDate,
                          long employeeID, double annualSalary,
                          boolean isRetired) {
        super(name, dateOfBirth, endDate, hireDate, employeeID);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

//    public void retire() {
//        this.setEndDate(getNowDate());
//    }
//
//    public static String getNowDate() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        LocalDateTime now = LocalDateTime.now();
//        return(dtf.format(now));
//    }
}
