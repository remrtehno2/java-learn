import java.util.ArrayList;

public class Store {
   public  ArrayList<InventoryItem> inventory;

   public ArrayList<Cart> carts = new ArrayList<>();

   public Store() {
      inventory = new ArrayList<>();
      inventory.add(new InventoryItem(new Product("A11", "Cola"), 10));
      inventory.add(new InventoryItem(new Product("A22", "Bread"), 10));
      inventory.add(new InventoryItem(new Product("A33", "Chips"), 10));
      inventory.add(new InventoryItem(new Product("A44", "Tea"), 10));
      inventory.add(new InventoryItem(new Product("A55", "Coffee"), 10));
      inventory.add(new InventoryItem(new Product("A66", "Meat"), 10));
      inventory.add(new InventoryItem(new Product("A77", "Ice Cream"), 10));
      inventory.add(new InventoryItem(new Product("A88", "Chocolate"), 10));
      inventory.add(new InventoryItem(new Product("A99", "Sugar"), 10));
      inventory.add(new InventoryItem(new Product("A100", "Beer"), 10));
   }
}
