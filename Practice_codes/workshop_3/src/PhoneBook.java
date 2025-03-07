import java.util.Arrays;

public class PhoneBook {
    private Contact[] contacts;
    private int size;

    public PhoneBook() {
        this.contacts = new Contact[10];
        this.size = 0;
    }

    private void resize () {
        contacts = Arrays.copyOf(contacts, contacts.length + 10);
    }

    public boolean addContact(Contact c) {
        for (int i = 0; i < size; i ++){
            if (contacts[i].getFirstName().equals(c.getFirstName()) && contacts[i].getLastName().equals( c.getLastName())) {
                return false;
            }
        }

        if (size == contacts.length) {
            resize();
        }
        contacts[size++] = c;
        return true;

    }

    public boolean deleteContact(String firstName, String lastName) {
        for (int i = 0; i < size; i ++){
            if (contacts[i].getFirstName().equals(firstName) && contacts[i].getLastName().equals(lastName)) {

                // shift elements to left.

                System.arraycopy(contacts, i + 1, contacts, i, size - i - 1);
                contacts[size--] = null;
                return true;
            }
        }
        return false;
    }

    public Contact[] findContacts(String group) {
        Contact[] gContacts = new Contact[size];
        int count = 0;

        for ( int i = 0; i < size; i ++){
            if (contacts[i].getGroup().equals(group)) {
                gContacts[count++] = contacts[i];
            }
        }
        return count == 0 ? null : Arrays.copyOf(gContacts, count);
    }

    public Contact findContact(String firstName, String lastName) {
        for (int i = 0; i < size; i ++){
            if (contacts[i].getFirstName().equals(firstName) && contacts[i].getLastName().equals(lastName)) {
                return contacts[i];
            }
        }
        return null;
    }

    public void printContacts() {
        if (size == 0) {
            System.out.println("No contacts in phone book");
            return;
        }
        for (int i = 0; i < size; i ++){
            System.out.println(contacts[i].getFirstName() + " " + contacts[i].getLastName());
        }
    }
}

