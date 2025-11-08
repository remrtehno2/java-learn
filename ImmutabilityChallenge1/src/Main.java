public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("John Almond", 100.0, 50.0);

        var customer = bank.getCustomer("000001");
        System.out.println(customer);

        bank.doTransaction("000001", BankAccount.TYPE.CHECKING, 5);
        bank.doTransaction("000001", BankAccount.TYPE.SAVING, 15);

        System.out.println(customer);

        /*
        BankAccount bankAccount1 = new BankAccount(BankAccount.TYPE.CHECKING, 10);
        BankAccount bankAccount2 = new BankAccount(BankAccount.TYPE.CHECKING, 2);

        BankCustomer john = new BankCustomer("John Baker", 1, bankAccount1, bankAccount2);
        BankCustomer Rick = new BankCustomer("Rick Sanchez", 2, bankAccount1, bankAccount2);

        // if balance is not final and not private
//        bankAccount1.balance = 110.0;

        print(john, Rick);
        john.getBankAccountList().clear();
        john.getBankAccountList().add(new BankAccount(BankAccount.TYPE.CHECKING, 10));
        print(john, Rick);
*/
    }

    public static void print(BankCustomer... args) {
        for (BankCustomer bankCustomer : args) {
            System.out.println(bankCustomer);
        }
    }
}