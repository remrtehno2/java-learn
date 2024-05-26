public class InventoryItem {
    private final Product product;
    private Integer qtyTotal;
    private Integer qtyReserved;
    private Integer qtyReorder;
    private Integer qtyLow;
    private final Double salesPrice;

    public InventoryItem(Product product, Integer qtyTotal, Double salesPrice) {
        this.product = product;
        this.qtyTotal = qtyTotal;
        this.salesPrice = salesPrice;
        this.qtyReserved = 0;
    }

    public void reserveItem(int qtyForReservation) {
        this.qtyReserved = qtyForReservation;
    }


    public Integer getQtyReserved() {
        return qtyReserved;
    }

    public void releaseItem() {
        this.qtyReserved = 0;
    }

    public void sellItem() {
        this.qtyTotal -= this.qtyReserved;
    }

    public void placeInventoryItem() {

    }

    public Product getProduct() {
        return product;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }


    @Override
    public String toString() {
        return "\n[%s] %s: %.2f$ | QTY: %d".formatted(product.sku() ,product, salesPrice, qtyTotal);
    }
}
