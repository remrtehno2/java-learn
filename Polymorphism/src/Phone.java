public class Phone implements Charchable {

    public void call() {
        System.out.println("Phone is calling");
    }


    // Перегрузка методов
    public void getContact(String nameOfContact) {
        if(!nameOfContact.isEmpty()) {
            System.out.println("Номер вашего контакта: 99999999");
        }
    }
    public void getContact(int phoneNumber) {
        if(phoneNumber > 0) {
            System.out.println("Имя вашего контакта: Петя");
        }
    }

    public boolean isCharged() {
        return false;
    }
}
