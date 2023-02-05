package Structural.Composite;

import java.util.List;

abstract class Employee {
    protected String name;
    protected String title;
    protected double salary;

    public Employee(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void add(Employee employee);

    public abstract void remove(Employee employee);

    public abstract List<Employee> getSubordinates();

    public abstract String toString();
}
