public record Product(String sku, String name, String manufacturer, categories category, int qty) {
    static public enum categories {
        PRODUCE, DAIRY, CEREAL, MEAT, BEVERAGE
    }
}
