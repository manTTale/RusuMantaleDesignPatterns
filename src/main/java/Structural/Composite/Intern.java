package Structural.Composite;

import java.util.List;

class Intern extends Employee {
    public Intern(String name, String title, double salary) {
        super(name, title, salary);
    }

    public void add(Employee employee) {

    }

    public void remove(Employee employee) {

    }

    public List<Employee> getSubordinates() {

        return null;
    }

    public String toString() {
        return "Intern: " + getName();
    }
}
