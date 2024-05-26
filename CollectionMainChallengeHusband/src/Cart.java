import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    public static enum TypeCart {
        PHYSICAL, VIRTUAL
    }
    public static int idInc = 1;
    private int id;
    private LocalDate date;
    private TypeCart type;

    private Double totalPrice;

    private Map<String, Integer> products;

    public Cart(TypeCart type) {
        this.date = LocalDate.now();
        this.type = type;
        this.id = idInc++;
        this.products = new HashMap<>();
        this.totalPrice = 0.0;
    }

    public void addItem(InventoryItem inventoryItem, Integer qty) {
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

    public void printSalesReceipt(List<InventoryItem> inventoryItems) {
        System.out.println("Products:");

        products.forEach((String sku, Integer qty) -> {
            final InventoryItem[] inventoryItem = {null};

            inventoryItems.forEach((val) -> {
                boolean isFound = val.getProduct().sku().equals(sku);

                if(isFound) {
                    inventoryItem[0] = val;
                    totalPrice += val.getSalesPrice();
                }
            });

            System.out.printf("%s: %d%n", sku, qty);
        });

        System.out.printf("Total Price: %s", totalPrice);

    }
}
