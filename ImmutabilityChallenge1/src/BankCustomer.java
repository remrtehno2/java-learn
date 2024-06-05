import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BankCustomer {

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

    public List<BankAccount> getBankAccountList() {
        // protect
        return new ArrayList<>(bankAccountList);
    }


    @Override
    public String toString() {
        return "%s: %s".formatted(name, bankAccountList.toString());
    }
}
