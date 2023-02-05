package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {
    private List<Employee> employees;

    public Manager(String name, String title, double salary) {
        super(name, title, salary);
        employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return employees;
    }

    public String toString() {
        return "Manager: " + getName();
    }
}

