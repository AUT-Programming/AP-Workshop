import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        System.out.println("""
                    commands list:
                    contacts -a <contact firstName> <contact lastName>
                    contacts -r <contact firstName> <contact lastName>
                    show -g <group name>
                    show -c <contact firstName> <contact lastName>
                    show
                    exit
                    """);

        while (true){

            String command = scanner.nextLine();
            String[] inputs = command.trim().split(" ");
            if (command.contains("contacts")){
                if (command.contains("-a")){
                    System.out.println("Please enter contact's group: ");
                    String group = scanner.nextLine();
                    if (group.isEmpty()){
                        group = "-";
                    }
                    System.out.println("Please enter contact's email: ");
                    String email = scanner.nextLine();
                    if (email.isEmpty()){
                        email = "-";
                    }
                    System.out.println("Please enter contact's country code: ");
                    String countryCode = scanner.nextLine();
                    // to check the first part of the mandatory 12-digit number
                    if (countryCode.length() != 3){
                        countryCode = "-";
                    }
                    System.out.println("Please enter contact's phone number: ");
                    String phoneNumber = scanner.nextLine();
                    // to check the second part of the mandatory 12-digit number (now in total of 12 digits)
                    if (phoneNumber.length() != 10){
                        phoneNumber = "-";
                    }
                    System.out.println("Please enter contact's zip code: ");
                    String zipCode = scanner.nextLine();
                    if (zipCode.isEmpty()){
                        zipCode = "-";
                    }
                    System.out.println("Please enter contact's country: ");
                    String country = scanner.nextLine();
                    if (country.isEmpty()){
                        country = "-";

                    }
                    System.out.println("Please enter contact's city: ");
                    String city = scanner.nextLine();
                    if (city.isEmpty()){
                        city = "-";
                    }
                    PhoneNumber contactPhoneNumber = new PhoneNumber(countryCode, phoneNumber);
                    Address address = new Address(zipCode, country, city);
                    Contact contact = new Contact(group, email, inputs[2], inputs[3], contactPhoneNumber, address);

                    if (phoneBook.addContact(contact)){
                        System.out.println("Contact saved!");
                    } else{
                        System.out.println("Couldn't add contact!");
                    }


                } else if (command.contains("-r")) {
                    if (phoneBook.deleteContact(inputs[2], inputs[3])){
                        System.out.println("Ok");
                    } else {
                        System.out.println("Not found");
                    }
                }
            } else if (command.contains("show")) {
                if (command.contains("-g")){
                    Contact [] foundContacts = phoneBook.findContacts(inputs[2]);
                    if (foundContacts == null){
                        System.out.println("No contacts found!");
                    }
                    else {
                        for (Contact contact : foundContacts){
                            showContactInfo(contact);
                        }
                    }
                } else if (command.contains("-c")) {
                    Contact contact = phoneBook.findContact(inputs[2], inputs[3]);
                    if (contact == null){
                        System.out.println("Contact not found!");
                    }
                    else {
                        showContactInfo(contact);
                    }
                } else if (command.equals("show")) {
                    phoneBook.printContacts();
                }
            } else if (command.equals("exit")) {
                break;
            }
            else {
                System.out.println("Wrong command!");
            }
        }
    }
    private static void showContactInfo(Contact contact){
        System.out.println("group: " + contact.getGroup());
        System.out.println("email: " + contact.getEmail());
        System.out.println("firstName: " + contact.getFirstName());
        System.out.println("lastName: " + contact.getLastName());
        System.out.println("phoneNumber: "+ contact.getPhoneNumber().toString());
        System.out.println("address: " + contact.getAddress().toString());
        System.out.println();
    }
}