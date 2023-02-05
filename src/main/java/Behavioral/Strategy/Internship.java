package Behavioral.Strategy;

class Internship {
    private PaymentStrategy paymentStrategy;
    private double amount;

    public Internship(double amount) {
        this.amount = amount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment() {
        paymentStrategy.pay(amount);
    }
}
