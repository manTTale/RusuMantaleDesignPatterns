package Behavioral.Strategy.without;

public class Main {
    public static void main(String[] args) {
        Internship internship = new Internship(1000, "creditcard", "Mantale Rusu", "1234567890", "123", "10/2023", "BRD", "1234567890");
        internship.makePayment();

        internship = new Internship(1000, "banktransfer", "Rusu Mantale", "1234567890", "123", "10/2023", "Banca Transilvania", "1234567890");
        internship.makePayment();
    }
}
