public class ButtonPhone extends Phone {
    private String name;
    public ButtonPhone() {
        this.name = "";
        System.out.println("Constructor no args");
    }
    public ButtonPhone(String arg1) {
        this.name = arg1;
        System.out.println("Constructor with 1 arg " + arg1);
    }

    public ButtonPhone(int arg1) {
        this.name = "Not appliable";
        System.out.println("Constructor with 1 (Integer) arg " + arg1);
    }

    public ButtonPhone(String arg1, String arg2) {
        this.name = arg1 + arg2 + "with 2 args";
        System.out.println(
                "Constructor with 2 args "
                + arg1
                + " "
                + arg2
        );
    }
}
