package Behavioral.Observer;

class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Internship internship) {
        System.out.println(name + " has been notified of internship update: " + internship.getName());
    }
}
