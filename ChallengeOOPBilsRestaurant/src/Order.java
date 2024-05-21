public class Order {
    Burger burger;
    Item drink;
    Item extra;

    public Order() {
        this.burger = new Burger();
        this.drink = new Item("Cola", "drink", 70, "l");
        this.extra = new Item("Fries", "extra", 15, "");
    }

    public Order(Burger burger, Item drink, Item extra) {
        this.burger = burger;
        this.drink = drink;
        this.extra = extra;
    }

    public void printAllItems() {
        System.out.println("====== All items in this order ======");
        this.burger.printItem();
        this.drink.printItem();
        this.extra.printItem();
    }

    public void printTotal() {
        double totalPrice = this.burger.getPrice() + this.drink.getPrice() + this.extra.getPrice();
        System.out.printf("==== Total Price: %s ====", totalPrice);
    }

    public void addToppingsToBurger(String topp) {
        burger.addExtraTopping(topp);
    }
}
