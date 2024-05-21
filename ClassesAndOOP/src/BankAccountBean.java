public class BankAccountBean {
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney(boolean isLogged) {
        if(isLogged) {
            return money;
        }

        return 0;
    }

    public void setMoney(int money, boolean isLogged) {
        /* ==== */

        if(isLogged) {
            this.money = money;
        }
    }
}
