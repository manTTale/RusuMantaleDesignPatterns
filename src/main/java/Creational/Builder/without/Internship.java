package Creational.Builder.without;

class Internship {
    private String name;
    private String company;
    private int duration;
    private boolean housing;
    private boolean transportation;

    public Internship(String name, String company, int duration, boolean housing, boolean transportation) {
        this.name = name;
        this.company = company;
        this.duration = duration;
        this.housing = housing;
        this.transportation = transportation;
    }

    public String toString() {
        return "InternshipBuilder{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", duration=" + duration +
                ", housing=" + housing +
                ", transportation=" + transportation +
                '}';
    }
}
