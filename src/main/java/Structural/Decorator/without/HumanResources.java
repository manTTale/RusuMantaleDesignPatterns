package Structural.Decorator.without;

class HumanResources {
    public static void main(String[] args) {
        Internship junior = new JuniorInternship("Junior Internship", 2000);
        System.out.println(junior.getTitle() + " with salary " + junior.getSalary() + " has the following responsibilities: " + junior.getResponsibilities());
        junior.setResearch(true);
        junior.setTechnicalSkills(true);
        System.out.println(junior.getTitle() + " with salary " + junior.getSalary() + " has the following responsibilities: " + junior.getResponsibilities());
    }
}
