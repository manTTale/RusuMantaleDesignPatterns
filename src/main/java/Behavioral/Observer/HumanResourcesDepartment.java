package Behavioral.Observer;

class HumanResourcesDepartment implements Observer {
    @Override
    public void update(Internship internship) {
        System.out.println("HR department notified of internship update: " + internship.getName());
    }
}
