package src.main.transactions;

import lombok.Data;
import java.time.LocalDateTime;

public class TransactionSocks<Socks> {

    private Socks socks;
    private boolean incoming;
    private int quantity;
    private LocalDateTime dateTimeTransaction;

    public TransactionSocks(Socks socks, boolean incoming, int quantity) {
        this.socks = socks;
        this.incoming = incoming;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Количество товара меньше или равно нулю! Введено количество=" + quantity);
        }
    }
}