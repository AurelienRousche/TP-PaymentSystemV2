package src.be.heh.dst.pms.application.model;

public class PaymentMode {
    protected String accountHolder;

    public PaymentMode(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
    }

    public void processPayment(double amount){}
}
