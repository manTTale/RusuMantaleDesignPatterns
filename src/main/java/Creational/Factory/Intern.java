package Creational.Factory;

class Intern {
    private String name;
    private String major;

    Intern(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
}
