package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Internship internship = new Internship();
        internship.attach(new HumanResourcesDepartment());

        Student student1 = new Student("Mantale Roberto");
        internship.attach(student1);

        Student student2 = new Student("Rusu Justinian");
        internship.attach(student2);

        internship.setName("Software Development Internship");
    }
}
