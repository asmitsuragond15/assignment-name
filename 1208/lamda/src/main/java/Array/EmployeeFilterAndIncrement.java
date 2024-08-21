package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeFilterAndIncrement {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 15000));
        employees.add(new Employee(2, "Jane Smith", 13000));
        employees.add(new Employee(3, "Jim Brown", 16000));
        employees.add(new Employee(4, "Jake White", 12000));

        // Filtering employees with salary > 14000 and applying 7% increment
        List<Employee> updatedEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 14000)
                .map(emp -> {
                    emp.setSalary(emp.getSalary() * 1.07);
                    return emp;
                })
                .collect(Collectors.toList());

        // Printing the updated employee list
        updatedEmployees.forEach(System.out::println);
    }
}
