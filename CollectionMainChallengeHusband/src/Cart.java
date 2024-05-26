import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    public enum TypeCart {
        PHYSICAL, VIRTUAL
    }
    public static int idInc = 1;
    private final int id;
    private final LocalDate date;
    private final TypeCart type;

    private Double totalPrice;

    private final Map<String, Integer> products;

    public Cart(TypeCart type) {
        this.date = LocalDate.now();
        this.type = type;
        this.id = idInc++;
        this.products = new HashMap<>();
        this.totalPrice = 0.0;
    }

    public void addItem(InventoryItem inventoryItem, Integer qty) {
        inventoryItem.reserveItem(inventoryItem.getQtyReserved() + qty);
        products.put(inventoryItem.getProduct().sku(), qty);
    }

    public void removeItem(InventoryItem inventoryItem) {
        products.remove(inventoryItem.getProduct().sku());
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public void printSalesReceipt(Map<String, InventoryItem> inventoryItems) {
        System.out.println("\nProducts:");

        products.forEach((String sku, Integer qty) -> {
            final InventoryItem inventoryItem = inventoryItems.get(sku);
            boolean isFound = inventoryItem.getProduct().sku().equals(sku);

                if(isFound) {
                    totalPrice += inventoryItem.getSalesPrice();
                }


            System.out.printf("%s: %d = %.2f$ \n", inventoryItem.getProduct().name(), qty, (inventoryItem.getSalesPrice() * qty));
        });

        System.out.printf("Total Price: %s$", totalPrice);

    }
}
