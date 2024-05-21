import java.util.*;

public class Main {
    private static ArrayList<Contakt> addressBook = new ArrayList<>();

    public static void main(String[] args) {
        // pre-defined data
        fillBookByDefault();
        mainMenuWithSelections();


        // ****** CRUD ******
//        updateElem(addressBook, "1165161", new Contakt("Sosedka", "123"));
    }
    private static int findByValue(ArrayList<Contakt> ContactsArg, String phoneNumber) {
        for (int i = 0; i < 3; i++) {
            Contakt foundElem = ContactsArg.get(i); // array[i]

            boolean isEqual = Objects.equals(foundElem.getPhoneNumber(), phoneNumber); // ==    // "mam".equals("mam");

            if (isEqual) {
                return i;
//                System.out.println(i);
//                System.out.println(foundElem.getName());
//                break;
            }
        };

        return -1;
    }
    private static void removeElem(ArrayList<Contakt> ContactsArg, String phoneNumber) {
        int indexOfFoundELem = findByValue(ContactsArg, phoneNumber);
        if(indexOfFoundELem != -1) {
            ContactsArg.remove(indexOfFoundELem);
        }
    }
    private static void updateElem(ArrayList<Contakt> ContactsArg, String phoneNumber, Contakt newContact) {
        int indexOfFoundElem2 = findByValue(ContactsArg, phoneNumber);

        if(indexOfFoundElem2 != -1) {
            ContactsArg.set(indexOfFoundElem2, newContact);
        }
    }

    private static void displayMenu() {
        System.out.println("**** Menu Address Book *****");
        System.out.println("Select any options:");
        System.out.println("Press A to add a contact:");
        System.out.println("Press F to find search:");
        System.out.println("Press P to print contacts:");
        System.out.println("Press D to delete contact:");
        System.out.println("Press Q to exit:");
    }
    private static String askOption() {
        Scanner scanner = new Scanner(System.in);
        String selectedOption = scanner.nextLine();


        switch (selectedOption) {
            case "A" : {
                System.out.println("Enter phone number: ");
                String newPhoneNumber = scanner.nextLine();
                System.out.println("Enter Name: ");
                String newName = scanner.nextLine();

                Contakt newContact = new Contakt(newName,newPhoneNumber);
                addressBook.add(newContact);
                break;
            }
            case "F": {
                System.out.println("Enter phone number: ");
                String phoneNumberForSearch = scanner.nextLine();

                var indexOfFoundElem = findByValue(addressBook, phoneNumberForSearch);
                var foundedContact = addressBook.get(indexOfFoundElem);

                System.out.println(foundedContact);
                break;
            }
            case "P": {
                printContacts();
                break;
            }
            case "D": {
                System.out.println("Enter phone number: ");
                String phoneNumberForSearch = scanner.nextLine();
                removeElem(addressBook,phoneNumberForSearch);
                break;
            }
        }

        if(selectedOption.equals("A")) {

        } else if (selectedOption.equals("F")) {

        } else if (selectedOption.equals("P")) {

        } else if (selectedOption.equals("D")) {

        }

        return selectedOption;
    }

    private static void fillBookByDefault() {
        // *** Contacts ***
        Contakt husband = new Contakt("husband", "9989897372");
        Contakt husband2 = new Contakt("A husband", "9989897372");
        Contakt mom = new Contakt("Mom", "987654321");
        Contakt marzik = new Contakt("marzik", "123");

        // *** Address book ***
        addressBook.add(husband);     // 0
        addressBook.add(mom);        // 1
        addressBook.add(marzik);    // 2
        addressBook.add(husband2); // 3
    }

    private static void printContacts() {
        // Show all
        for (Contakt S : addressBook) {
            System.out.println(S);
        }
    }

    private static void mainMenuWithSelections() {
        displayMenu();
        String selectedOption = askOption();

        while (!selectedOption.equals("Q")) {
            displayMenu();
            selectedOption = askOption();
        }
    }
}




/*
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello"); // Explicitly intern the string

        System.out.println(s1 == s2); // Output: true (same object reference)
        System.out.println(s1 == s3); // Output: true (s3 is interned, same object reference)
        System.out.println(
                List.of(s1.hashCode(),s2.hashCode(),s3.hashCode())
        );


        HashSet<Contakt> contaktHashSet = new HashSet<>(List.of(husband, mom, marzik, husband));
        for (var contactVar : contaktHashSet) {
            System.out.println("Contact set: " + contactVar.getName());
        }


        var comparingAlgorigthm = Comparator.comparing(Contakt::getPhoneNumber)
                .thenComparing(Contakt::getName);
        Collections.sort(Contacts, comparingAlgorigthm);



        // index of - overwrite equals for sort
        System.out.println(
                marzik.getClass() == new Contakt("marzik", "1165161").getClass()
        );
        System.out.println("Runtime class of obj: " + marzik.getClass());

      //  Objects.equals();
 */