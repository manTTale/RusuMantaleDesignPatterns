package Creational.Factory;

class Main {
    public static void main(String[] args) {
        HumanResources hr = new HumanResources(new SoftwareInternFactory());
        Intern intern = hr.hireIntern("Mantale Rusu", "Computer Science");
        System.out.println("Hired Intern: " + intern.getName() + " Major: " + intern.getMajor());
    }
}
