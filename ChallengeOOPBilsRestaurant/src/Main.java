public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
//
//        burger.addExtraTopping("Chilly");
//        burger.addExtraTopping("Avocado");
//        burger.addExtraTopping("Bacon");
//
//        burger.printItem();
//        System.out.println(burger.getPrice());
//
//        Item soda = new Item("Cola", "drink", 70, "l");
//        soda.printItem();
//
//        Item fries = new Item("Fries", "extra", 15, "");
//        fries.printItem();

       // Order order1 = new Order();
        //order1.addToppingsToBurger("Chilly");

        //order1.printAllItems();
       // order1.printTotal();

        DeluxeOrder deluxeOrder = new DeluxeOrder();
        deluxeOrder.printAllItems();
        deluxeOrder.printTotal();


    }
}
