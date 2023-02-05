package Behavioral.Observer.without;

class HumanResourcesDepartment {
    public void notify(Internship internship) {
        System.out.println("HR department notified of internship update: " + internship.getName());
    }
}
