import dev.dto.Transaction;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {
    enum TYPE {
        CHECKING, SAVING
    }
    private final TYPE type;
    //    private final double balance;

    double balance;

    private Map<Long, Transaction> transactions;

    BankAccount(TYPE type, double balance) {
        this.type = type;
        this.balance = balance;
        this.transactions = new HashMap<>();
    }

    public Map<Long, Transaction> getTransactions() {
        return transactions;
    }

    public long commitTransaction(int routingNumber, String customerId, double amount) {
        Transaction transaction = new Transaction(routingNumber, customerId,  amount);

        balance -= amount;

        this.transactions.put(transaction.getTransactionId(), transaction);

        return transaction.getTransactionId();
    }

    public TYPE getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Balance: " + balance;
    }

}
