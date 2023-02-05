package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Internship internship = new Internship(1000);

        CreditCardStrategy creditCardStrategy = new CreditCardStrategy("Mantale Rusu", "1234567890", "123", "10/2023");
        internship.setPaymentStrategy(creditCardStrategy);
        internship.makePayment();

        BankTransferStrategy bankTransferStrategy = new BankTransferStrategy("Banca Transilvania", "1234567890");
        internship.setPaymentStrategy(bankTransferStrategy);
        internship.makePayment();
    }
}
