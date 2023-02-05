package Behavioral.Observer.without;

public class Main {
    public static void main(String[] args) {
        Internship internship = new Internship();
        HumanResourcesDepartment hrDepartment = new HumanResourcesDepartment();
        internship.setHrDepartment(hrDepartment);

        Student student1 = new Student("Mantale Roberto");
        internship.attachStudent(student1);

        Student student2 = new Student("Rusu Justinian");
        internship.attachStudent(student2);

        internship.setName("Software Development Internship");
    }
}
