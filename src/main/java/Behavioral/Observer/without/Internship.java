package Behavioral.Observer.without;

import java.util.ArrayList;
import java.util.List;

class Internship {
    private String name;
    private HumanResourcesDepartment hrDepartment;
    private List<Student> students = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
        notifyHumanResourcesDepartment();
        notifyStudents();
    }

    public String getName() {
        return name;
    }

    public HumanResourcesDepartment getHrDepartment() {
        return hrDepartment;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setHrDepartment(HumanResourcesDepartment hrDepartment) {
        this.hrDepartment = hrDepartment;
    }

    public void attachStudent(Student student) {
        students.add(student);
    }

    public void detachStudent(Student student) {
        students.remove(student);
    }

    private void notifyHumanResourcesDepartment() {
        if (hrDepartment != null) {
            hrDepartment.notify(this);
        }
    }

    private void notifyStudents() {
        for (Student student : students) {
            student.notify(this);
        }
    }
}
