package src.be.heh.dst.pms.application.model;

public class CreditCardPayment extends PaymentMode{

    private String cardNumber;

    public CreditCardPayment(String accountHolder, String cardNumber) {
        super(accountHolder);
        this.cardNumber = cardNumber;
    }

    public void processPayment(double amount){
        System.out.println("Paiement de "+amount+"€ effectué par Carte Bancaire ("+this.cardNumber+")");
    }
}
