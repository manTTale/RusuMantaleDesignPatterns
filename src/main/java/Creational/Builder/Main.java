package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Internship internship = new Internship.InternshipBuilder("Software Development Internship", "Google")
                .duration(6)
                .housing(true)
                .transportation(true)
                .build();

        System.out.println(internship);
    }
}
