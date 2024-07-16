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
    }

    // Test salary employee
    SalaryEmployee mike = new SalaryEmployee("George", "4/11/1987", null, "01/01/2000",900000002, 100000, false);
    System.out.println()
}
