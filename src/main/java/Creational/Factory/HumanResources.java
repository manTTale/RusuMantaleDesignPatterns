package Creational.Factory;

class HumanResources {
    private InternFactory internFactory;

    HumanResources(InternFactory internFactory) {
        this.internFactory = internFactory;
    }

    public Intern hireIntern(String name, String major) {
        return internFactory.createIntern(name, major);
    }

}
