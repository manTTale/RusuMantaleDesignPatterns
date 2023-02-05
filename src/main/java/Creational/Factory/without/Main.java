package Creational.Factory.without;

class Main {
    public static void main(String[] args) {
        HumanResources hr = new HumanResources();
        Intern intern = hr.hireIntern("Mantale Rusu", "Computer Science");
        System.out.println("Hired Intern: " + intern.getName() + " Major: " + intern.getMajor());
    }
}
