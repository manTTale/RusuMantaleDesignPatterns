package Structural.Decorator;

abstract class Internship {
    protected String title;
    protected double salary;

    public Internship(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public abstract String getResponsibilities();
}
