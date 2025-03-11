package src.be.heh.dst.pms.main;

import src.be.heh.dst.pms.application.model.*;
import src.be.heh.dst.pms.application.service.Transaction;
import src.be.heh.dst.pms.infastructure.MemoryTransaction;

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMode credit = new CreditCardPayment("Aurélien Debande", "176324723");
        PaymentMode bank = new BankTransferPayment("Yann Motte", "BE7160452969");
        MemoryTransaction memory = new MemoryTransaction();

        Transaction transaction1 = new Transaction(credit, memory);
        Transaction transaction2 = new Transaction(bank, memory);

        transaction1.makePayment(150.75);
        transaction2.makePayment(500);
        memory.show_history();
    }
}
