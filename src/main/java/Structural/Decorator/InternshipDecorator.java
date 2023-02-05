package Structural.Decorator;

abstract class InternshipDecorator extends Internship {
    protected Internship internship;

    public InternshipDecorator(Internship internship) {
        super(internship.title, internship.salary);
        this.internship = internship;
    }
}
