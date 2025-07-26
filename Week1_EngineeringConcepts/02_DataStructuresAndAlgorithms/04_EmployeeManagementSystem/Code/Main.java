public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Alice", "Developer", 70000));
        manager.addEmployee(new Employee(102, "Bob", "Designer", 65000));
        manager.addEmployee(new Employee(103, "Charlie", "Manager", 90000));

        System.out.println("All Employees:");
        manager.listEmployees();

        System.out.println("\nSearching for employee with ID 102:");
        Employee found = manager.searchEmployee(102);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting employee with ID 101:");
        if (manager.deleteEmployee(101)) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nEmployees after deletion:");
        manager.listEmployees();
    }
}