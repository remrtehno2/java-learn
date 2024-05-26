public class Main {
    public static void main(String[] args) {
        var store = new Store();


        Cart cart1 = new Cart(Cart.TypeCart.VIRTUAL);
        store.carts.put(cart1.getId(), cart1);

        cart1.addItem(store.inventory.get("A103"), 2);
        cart1.addItem(store.inventory.get("A103"), 1);


        System.out.println(store.inventory);


        store.checkOutCart(cart1.getId());

        System.out.println(store.inventory);
    }
}