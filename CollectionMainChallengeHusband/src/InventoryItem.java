public class InventoryItem {
    private Product product;
    private Integer qtyTotal;
    private Integer qtyReserved;
    private Integer qtyReorder;
    private Integer qtyLow;
    private Integer salesPrice;

    public InventoryItem(Product product, Integer qtyTotal, Integer qtyReserved, Integer qtyReorder, Integer qtyLow, Integer salesPrice) {
        this.product = product;
        this.qtyTotal = qtyTotal;
        this.qtyReserved = qtyReserved;
        this.qtyReorder = qtyReorder;
        this.qtyLow = qtyLow;
        this.salesPrice = salesPrice;
    }

    public void reserveItem(int qtyForReservation) {
        this.qtyReserved = qtyForReservation;
    }
    public void releaseItem() {
        this.qtyReserved = 0;
    }
    public void sellItem() {
        this.qtyTotal -= this.qtyReserved;
    }
    public void placeInventoryItem() {

    }
}
