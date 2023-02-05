package Behavioral.Strategy;

class BankTransferStrategy implements PaymentStrategy {
    private String bankName;
    private String accountNumber;

    public BankTransferStrategy(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    public void pay(double amount) {
        System.out.println(amount + " paid with bank transfer");
    }
}
