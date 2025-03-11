package src.be.heh.dst.pms.infastructure;

import src.be.heh.dst.pms.application.service.SaveTransaction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MemoryTransaction implements SaveTransaction {

    private List<String> transactions = new ArrayList<>();

    @Override
    public void save(String transaction) {
        this.transactions.add(transaction + " at " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    public void show_history() {
        for(String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
