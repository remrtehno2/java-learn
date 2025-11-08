import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BankCustomer {
    public static int lastId = 1;
    private final String name;
    private final int id;
    private final List<BankAccount> bankAccountList;

    BankCustomer(String name, int id, BankAccount... rest) {
        this.name = name;
        this.id = id;
        this.bankAccountList = new ArrayList<>();
        Collections.addAll(this.bankAccountList, rest);
//        this.bankAccountList = List.copyOf(bankAccountList);
    }

    public String getId() {
        return "00000" + id;
    }

    public BankAccount getAccount(BankAccount.TYPE type) {
        for (BankAccount bankAccount : bankAccountList) {
            boolean isFound = bankAccount.getType().equals(type);

            if (isFound) {
                return bankAccount;
            }
        }

        return null;
    }


    public List<BankAccount> getBankAccountList() {
        // protect
        return new ArrayList<>(bankAccountList);
    }


    @Override
    public String toString() {
        return "%s: %s".formatted(name, bankAccountList.toString());
    }
}
