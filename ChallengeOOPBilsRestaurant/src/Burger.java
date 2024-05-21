public class Burger extends Item {
    private Item extraTop1 = null;
    private Item extraTop2 = null;
    private Item extraTop3 = null;
    public Burger() {
        super("Standard Burger", "100", 100, "Standard");
        setName("Standard Burger");
        setPrice(100);
        setSize("S");
        setType("Standard");
    }
    public void addExtraTopping(String typeOfTopping) {
        if(typeOfTopping == "Chilly") {
            extraTop1 = new Item("CHILLY", "TOPPING", 7, "");
        }
        if(typeOfTopping == "Avocado") {
            extraTop2 = new Item("AVOCADO", "TOPPING", 10, "");
        }
        if(typeOfTopping == "Bacon")  {
            extraTop3 = new Item("BACON", "TOPPING", 35, "");
        }
    }
    @Override
    public void printItem() {
        String extraTops = "";

        if (extraTop1 != null) {
            extraTops += extraTop1.getName();
            extraTops += ", ";
        }
        if (extraTop2 != null) {
            extraTops += extraTop2.getName();
            extraTops += ", ";
        }
        if (extraTop3 != null) {
            extraTops += extraTop3.getName();
            extraTops += ", ";
        }

        if(extraTops == "") {
            extraTops = "None";
        }

        System.out.printf("[Item: %s. Price: %s. Extra toppings: %s.]",
                getName(),
                getPrice(),
                extraTops
        );
        System.out.println("");
    }
   @Override
    public double getPrice() {
        int totalPrice = 0;

        if (extraTop1 != null) {
            totalPrice += extraTop1.getPrice();
        }

        if (extraTop2 != null) {
            totalPrice += extraTop2.getPrice();
        }

        if (extraTop3 != null) {
            totalPrice += extraTop3.getPrice();
        }
        return price + totalPrice;
    }
}

// AVOCADO = 10; BACON = 37; CHILLY = 7;