import java.util.ArrayList;
public class PhoneBook {
    private ArrayList<String> listOfNames = new ArrayList<>();
    private ArrayList<String> listOfNumbers = new ArrayList<>();
    private String name;
    private String phoneNumber;
    public void setListOfNames(ArrayList<String> listOfNames) {
        this.listOfNames = listOfNames;
    }
    public ArrayList<String> getListOfNames() {
        return listOfNames;
    }
    public void setListOfNumbers(ArrayList<String> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }
    public ArrayList<String> getListOfNumbers() {
        return listOfNumbers;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void addContactToPhoneBook() {
        listOfNames.add(name);
        listOfNumbers.add(phoneNumber);
    }
    public void deleteContactFromPhoneBook() {
        for(int count = 0; count < listOfNames.size(); count++) {
            if (name.equalsIgnoreCase(listOfNames.get(count))) {
                listOfNames.remove(count);
                listOfNumbers.remove(count);
            }
        }

    }

    public void editContactFromPhoneBook(String nameToCheck) {
        for(int count = 0; count < listOfNames.size(); count++) {
            if (name.equalsIgnoreCase(listOfNames.get(count))) {
                listOfNames.set(count, name);
                listOfNumbers.set(count, phoneNumber);
            }
        }

    }
    public void displayContacts() {
        for(int count = 0; count < listOfNames.size(); count++) {
            System.out.printf("-Name: %s%n", listOfNames.get(count));
            System.out.printf("-Number: %s%n", listOfNumbers.get(count));
            System.out.println();
        }
    }
    public void searchContact(String name) {
        for(int count = 0; count < listOfNames.size(); count++) {
            if(name.equalsIgnoreCase(listOfNames.get(count))){
                System.out.printf("Name: %s%n", listOfNames.get(count));
                System.out.printf("Number:  %s%n", listOfNumbers.get(count));
            }

        }

    }
    public void displayMenu() {
        System.out.print("""
                Phonebook Menu
                1.Add contact
                2.Delete contact
                3.Edit contact
                4.Search for contact
                5.View existing contacts
                6.Exit
                """);
    }

}
