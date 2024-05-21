import java.util.List;

public class Store {
    public List<InventoryItem> inventory;
    public List<Cart> carts;
    public List<InventoryItem> aisleInventory;

    public void abandonCarts() {
        this.carts.clear();
    }
}
