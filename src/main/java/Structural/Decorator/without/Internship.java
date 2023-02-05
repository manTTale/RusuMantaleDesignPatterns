package Structural.Decorator.without;

abstract class Internship {
    protected String title;
    protected double salary;
    protected boolean research;
    protected boolean technicalSkills;

    public Internship(String title, double salary) {
        this.title = title;
        this.salary = salary;
        research = false;
        technicalSkills = false;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public void setResearch(boolean research) {
        this.research = research;
    }

    public void setTechnicalSkills(boolean technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public String getResponsibilities() {
        StringBuilder result = new StringBuilder("junior responsibilities");
        if (research) {
            result.append(", Research");
        }
        if (technicalSkills) {
            result.append(", Technical Skills");
        }
        return result.toString();
    }
}
