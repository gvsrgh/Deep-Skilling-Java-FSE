# Hands-On Exercise: Sorting Customer Orders

## Scenario
You are developing an employee management system for a company. Efficiently managing employee records is crucial.

## Steps
1.	Understand Array Representation:
    * Explain how arrays are represented in memory and their advantages.
2.	Setup:
    * Create a class Employee with attributes like employeeId, name, position, and salary.
3.	Implementation:
    * Use an array to store employee records.
    * Implement methods to add, search, traverse, and delete employees in the array.
4.	Analysis:
    * Analyze the time complexity of each operation (add, search, traverse, delete).
    * Discuss the limitations of arrays and when to use them.

### Employee Class Implementation
```java
public class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "ID=" + employeeId +
               ", Name='" + name + '\'' +
               ", Position='" + position + '\'' +
               ", Salary=" + salary +
               '}';
    }
}
```

### EmployeeManager Class Implementation
```java
public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public boolean addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
            return true;
        }
        return false;
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void listEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                return true;
            }
        }
        return false;
    }
}
```

### Main Class Implementation
```java
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
```

### Explain how arrays are represented in memory and their advantages

Arrays are represented in memory as a contiguous block of memory locations. Each element in the array is stored at a specific index, allowing for efficient access using the index. The advantages of using arrays include:
1. **Fast Access**: Elements can be accessed in constant time O(1) using their index.
2. **Memory Efficiency**: Arrays have a low overhead compared to other data structures like linked lists.
3. **Cache Performance**: Contiguous memory allocation improves cache performance, leading to faster access times.
### Analyze the time complexity of each operation

1. **Add Employee**: O(1) - Adding an employee to the end of the array is a constant time operation.
2. **Search Employee**: O(n) - In the worst case, we may need to search through the entire array.
3. **List Employees**: O(n) - Listing all employees requires iterating through the array.
4. **Delete Employee**: O(n) - Deleting an employee requires shifting elements, leading to a linear time complexity.