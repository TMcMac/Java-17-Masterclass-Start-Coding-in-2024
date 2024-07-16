public class Worker {
    //Top class for employees of a business
    private String name;
    private String dateOfBirth;
    private String endDate;

    public Worker(String name, String dateOfBirth, String endDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAge() {
        if (this.dateOfBirth.length() < 8) {
            System.out.println("Date of birth was not entered as mm/dd/yyyy");
            return -1;
        }
        String subStr = this.dateOfBirth.substring(this.dateOfBirth.length() -4);
        return (2024 - Integer.parseInt(subStr));
    }

    public double collectPay() {
        return 1000.00;
    }

    public String terminate(String endDate) {
        return (this.name + " ended employment on " + endDate);
    }
}
