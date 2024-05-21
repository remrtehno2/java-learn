public class DeluxeOrder extends Order {
    Burger burger = null;
    Item drink = null;
    Item extra = null;
    public DeluxeOrder() {
        this.burger = new Burger();
        this.drink = new Item("Cola", "drink", 70, "l");
        this.extra = new Item("Fries", "extra", 15, "");

        burger.addExtraTopping("Chilly");
        burger.addExtraTopping("Bacon");
        burger.addExtraTopping("Avocado");
    }
}


