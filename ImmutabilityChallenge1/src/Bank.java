import java.util.HashMap;
import java.util.Map;

public class Bank {
    private int routingNumber;
    private long lastTransactionId;
    private final Map<String, BankCustomer> customers;

    public Bank() {
        this.customers = new HashMap<>();
    }

    public BankCustomer getCustomer(String id) {
//        customer.forEach((String key, BankCustomer bankCustomer) -> {
//
//        });

        return customers.get(id);
    }

    public void addCustomer(String name, double checkingInitialDeposit, double savingInitialDeposit) {
        BankCustomer bankCustomer = new BankCustomer(
                name, BankCustomer.lastId++,
                new BankAccount(BankAccount.TYPE.CHECKING, checkingInitialDeposit),
                new BankAccount(BankAccount.TYPE.SAVING, savingInitialDeposit)
        );
        customers.put(bankCustomer.getId(), bankCustomer);
    }

    public long doTransaction(String id, BankAccount.TYPE type, double amount) {
        BankCustomer bankCustomer = customers.get(id);
        BankAccount bankAccount = bankCustomer.getAccount(type);

        if (bankAccount != null) {
            lastTransactionId = bankAccount.commitTransaction(0, id, amount);
        }

        return lastTransactionId;
    }
}
