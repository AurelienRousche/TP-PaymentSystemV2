package src.be.heh.dst.pms.application.service;

import src.be.heh.dst.pms.application.model.PaymentMode;

public class Transaction {

    private PaymentMode pm;
    private SaveTransaction st;

    public Transaction(PaymentMode pm, SaveTransaction st) {
        this.pm = pm;
        this.st = st;
    }

    public void makePayment(double amount){
        pm.processPayment(amount);
        st.save("Transaction saved: " + amount);
    }
}
