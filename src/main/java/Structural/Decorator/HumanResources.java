package Structural.Decorator;

class HumanResources {
    public static void main(String[] args) {
        Internship junior = new JuniorInternship("Junior Internship", 2000);
        System.out.println(junior.getTitle() + " with salary " + junior.getSalary() + " has the following responsibilities: " + junior.getResponsibilities());

        Internship research = new ResearchInternshipDecorator(junior);
        System.out.println(research.getTitle() + " with salary " + research.getSalary() + " has the following responsibilities: " + research.getResponsibilities());

        Internship technical = new TechnicalInternshipDecorator(research);
        System.out.println(technical.getTitle() + " with salary " + technical.getSalary() + " has the following responsibilities: " + technical.getResponsibilities());
    }
}
