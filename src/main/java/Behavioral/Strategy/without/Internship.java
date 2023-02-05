package Behavioral.Strategy.without;

class Internship {
    private double amount;
    private String paymentMethod;
    private String creditCardName;
    private String creditCardNumber;
    private String creditCardCvv;
    private String creditCardExpiry;
    private String bankName;
    private String bankAccountNumber;

    public Internship(double amount, String paymentMethod, String creditCardName, String creditCardNumber, String creditCardCvv, String creditCardExpiry, String bankName, String bankAccountNumber) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.creditCardName = creditCardName;
        this.creditCardNumber = creditCardNumber;
        this.creditCardCvv = creditCardCvv;
        this.creditCardExpiry = creditCardExpiry;
        this.bankName = bankName;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void makePayment() {
        if (paymentMethod.equals("creditcard")) {
            System.out.println(amount + " paid with credit/debit card");
        } else if (paymentMethod.equals("banktransfer")) {
            System.out.println(amount + " paid with bank transfer");
        }
    }
}
