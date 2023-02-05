package Structural.Decorator;

class TechnicalInternshipDecorator extends InternshipDecorator {
    public TechnicalInternshipDecorator(Internship internship) {
        super(internship);
    }
    public String getResponsibilities() {
        return internship.getResponsibilities() + ", Technical Skills";
    }
}

