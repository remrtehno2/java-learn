import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    public Map<String, InventoryItem> inventory = new HashMap<>();
    public Map<Integer, Cart> carts;
    public List<InventoryItem> aisleInventory;

    public Store() {
        List<InventoryItem> products = List.of(
                new InventoryItem(new Product("A103", "Tea", "US", Product.categories.BEVERAGE), 20, 2.0),
                new InventoryItem(new Product("U890", "Tsar", "RU", Product.categories.CEREAL), 35, 4.1),
                new InventoryItem(new Product("S121", "Chicken", "local", Product.categories.MEAT), 100, 7.0),
                new InventoryItem(new Product("P097", "Bread", "FR", Product.categories.PRODUCE), 50, 1.1),
                new InventoryItem(new Product("A152", "Coffee", "RU", Product.categories.PRODUCE), 100, 9.0),
                new InventoryItem(new Product("S897", "Cola", "GE", Product.categories.PRODUCE), 200, 2.5)
        );

        //this.inventory = products;



        this.carts = new HashMap<>();

        products.forEach((InventoryItem product) -> {
            this.inventory.put(product.getProduct().sku(), product);
        });
    }

    public void abandonCarts() {
        this.carts.clear();
    }

    public void checkOutCart(int id) {
        Cart cart = this.carts.get(id);

        cart.printSalesReceipt(inventory);

        cart.getProducts().forEach((sku, qty) -> {
            inventory.get(sku).sellItem();
        });

    }

}
