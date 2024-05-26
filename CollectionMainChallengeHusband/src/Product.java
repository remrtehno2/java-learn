public record Product(String sku, String name, String manufacturer, categories category) {
    static public enum categories {
        PRODUCE, DAIRY, CEREAL, MEAT, BEVERAGE
    }

    @Override
    public String toString() {
        return name;
    }
}
