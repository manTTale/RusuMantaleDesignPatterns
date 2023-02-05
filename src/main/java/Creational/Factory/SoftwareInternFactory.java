package Creational.Factory;

class SoftwareInternFactory implements InternFactory {
    public Intern createIntern(String name, String major) {
        return new Intern(name, major);
    }
}
