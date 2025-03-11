package src.be.heh.dst.pms.application.model;

public class BankTransferPayment extends PaymentMode{

    private String iban;

    public BankTransferPayment(String accountHolder, String iban) {
        super(accountHolder);
        this.iban = iban;
    }

    public void processPayment(double amount){
        System.out.println("Paiement de "+amount+"€ effectué par Virement Bancaire ("+this.iban+")");
    }
}
