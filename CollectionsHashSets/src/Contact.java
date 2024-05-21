import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Contact {

    public String name;
    public Set<String> emails = new HashSet<>();
    public Set<String> phones = null;

    public Contact(String name, List<String> phones) {
        this.name = name;

        this.phones = new HashSet<>(phones);
//        for(var ph : phones) {
//            phones.add(ph);
//        }
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name, emails, phones);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        System.out.println("Equals" + name + phones);

        return name.equals(contact.name) || phones.equals(contact.phones);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}