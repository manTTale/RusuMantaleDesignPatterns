package Creational.Factory.without;

class HumanResources {
    public Intern hireIntern(String name, String major) {
        return new Intern(name, major);
    }
}
