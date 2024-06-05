public  class BankAccount {
    enum TYPE  {
        CHECKING, SAVING
    }

    private final TYPE type;
    private final double balance;
//  double balance;

    BankAccount(TYPE type, double balance) {
        this.type = type;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Balance: " + balance;
    }

}
