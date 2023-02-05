package Structural.Decorator;

class ResearchInternshipDecorator extends InternshipDecorator {
    public ResearchInternshipDecorator(Internship internship) {
        super(internship);
    }

    public String getResponsibilities() {
        return internship.getResponsibilities() + ", Research";
    }
}
