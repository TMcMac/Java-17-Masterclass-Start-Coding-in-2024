public class Main {
    public static void main(String[] args) {
        // Tests for the Worker class
        Worker testWorker = new Worker("John", "01/01/1990", "07/15/2024");
        System.out.println(testWorker.getName() + " is " + testWorker.getAge() + " years old.");
        System.out.println(testWorker.getName() + " was paid " + testWorker.collectPay());
        System.out.println(testWorker.terminate("7/16/2024"));

        //Tests for employee
        Employee employee = new Employee("Madison", "02/12/2000", null, "01/01/2023",900000001);
        System.out.println(employee.getName() + " is " + employee.getAge() + " years old");
        System.out.println(employee.getName() + " was paid " + employee.collectPay());
        System.out.println(employee.terminate("7/16/2024"));

        // Test salary employee
        SalaryEmployee mike = new SalaryEmployee("Mike","01/01/1985",
                "01/01/2024","01/01/2005",
                9000002,100000,false);
        System.out.println(mike.getName() + " is " + mike.getAge() + " years old");
        System.out.println(mike.getName() + " was paid " + mike.collectPay());
        System.out.println(mike.getName() + " is retired: " + mike.isRetired());
        System.out.println(mike.terminate("7/16/2024"));
        // Test hourly employee
        HourlyEmployee Ted = new HourlyEmployee("Ted", "01/01/1995",
                null, "01/01/2015",
                90000004,25.50);
        System.out.println(Ted.getName() + " is " + Ted.getAge() + " years old");
        System.out.println(Ted.getName() + " was paid " + Ted.collectPay());
        System.out.println(Ted.getName() + " worked a double and got " + Ted.getDoublePay() + " an hour!!");
        System.out.println(Ted.getName() + " started on " + Ted.getHireDate());
        System.out.println(Ted.terminate("7/16/2024"));
    }


}
