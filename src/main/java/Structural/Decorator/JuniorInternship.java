package Structural.Decorator;

class JuniorInternship extends Internship {
    public JuniorInternship(String title, double salary) {
        super(title, salary);
    }

    public String getResponsibilities() {
        return "junior responsibilities";
    }
}
