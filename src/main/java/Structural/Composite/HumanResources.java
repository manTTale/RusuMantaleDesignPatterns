package Structural.Composite;

class HumanResources {
    public static void main(String[] args) {
        Manager CEO = new Manager("Mantale", "CEO", 100000);

        Manager CTO = new Manager("Rusu", "CTO", 80000);
        Manager CFO = new Manager("Horceag", "CFO", 75000);

        Intern intern1 = new Intern("Roberto", "Intern", 25000);
        Intern intern2 = new Intern("Justinian", "Intern", 25000);

        CEO.add(CTO);
        CEO.add(CFO);

        CTO.add(intern1);
        CFO.add(intern2);

        System.out.println(CEO);
        for (Employee manager : CEO.getSubordinates()) {
            System.out.println("  " + manager);
            for (Employee intern : manager.getSubordinates()) {
                System.out.println("    " + intern);
            }
        }

    }
}
