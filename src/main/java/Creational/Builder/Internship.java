package Creational.Builder;

class Internship {
    private String name;
    private String company;
    private int duration;
    private boolean housing;
    private boolean transportation;

    private Internship(InternshipBuilder builder) {
        this.name = builder.name;
        this.company = builder.company;
        this.duration = builder.duration;
        this.housing = builder.housing;
        this.transportation = builder.transportation;
    }

    public static class InternshipBuilder {
        private final String name;
        private final String company;
        private int duration;
        private boolean housing;
        private boolean transportation;

        public InternshipBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public InternshipBuilder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public InternshipBuilder housing(boolean housing) {
            this.housing = housing;
            return this;
        }

        public InternshipBuilder transportation(boolean transportation) {
            this.transportation = transportation;
            return this;
        }

        public Internship build() {
            return new Internship(this);
        }

        @Override
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
}
