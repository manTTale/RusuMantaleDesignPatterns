package Behavioral.Observer.without;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void notify(Internship internship) {
        System.out.println(name + " has been notified of internship update: " + internship.getName());
    }
}
