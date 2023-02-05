package Structural.Composite.without;

class HumanResources {
    public static void main(String[] args) {
        Manager CEO = new Manager("Mantale", 100000);
        Manager CTO = new Manager("Rusu", 80000);
        Manager CFO = new Manager("Horceag", 75000);

        Intern intern1 = new Intern("Antonio", 25000);
        Intern intern2 = new Intern("Justinian", 25000);

        System.out.println("Employees: ");
        System.out.println(CEO);
        System.out.println(CTO);
        System.out.println(CFO);
        System.out.println(intern1);
        System.out.println(intern2);
    }
}
