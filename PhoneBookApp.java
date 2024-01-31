import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBookApp {
    private static Scanner input = new Scanner(System.in);
    private static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {

        ArrayList<String> listOfNames = new ArrayList<>();
        ArrayList<String> listOfNumbers = new ArrayList<>();

        phoneBook.setListOfNames(listOfNames);
        phoneBook.setListOfNumbers(listOfNumbers);

        runPhoneBookApp(phoneBook);

}
    public static void runPhoneBookApp(PhoneBook phoneBook) {
        
        phoneBook.displayMenu();

        System.out.print("Select an option: ");
        int option = input.nextInt();
        System.out.println();

        switch (option) {

            case 1:
                displayAddContactMenu();
                break;

            case 2:
                displayDeleteContactMenu();
                break;

            case 3:
                displayEditContactMenu();
                break;
                
            case 4:
                displaySearchContactMenu();
                break;
                
            case 5:
                displayViewExistingContactsMenu();
                break;

        }

    }
    public static void displayAddContactMenu() {

        System.out.print("Enter name: ");
        input.nextLine();
        String nameToBeAdded = input.nextLine();

        phoneBook.setName(nameToBeAdded);

        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();
        phoneBook.setPhoneNumber(phoneNumber);

        phoneBook.addContactToPhoneBook();

        System.out.println("""
                            1.Go back to the Main menu
                            2.Exit
                            """);
        System.out.print("Select an option: ");
        String choice = input.nextLine();
        if(choice.equalsIgnoreCase("1")) {
            runPhoneBookApp(phoneBook);
        }

    }
    public static void displayDeleteContactMenu() {

        System.out.print("Enter name: ");
        input.nextLine();
        String nameToBeDeleted = input.nextLine();

        phoneBook.setName(nameToBeDeleted);

        phoneBook.deleteContactFromPhoneBook();
        
        System.out.println("""
                            1.Go back to the Main menu
                            2.Exit
                            """);
        System.out.print("Select an option: ");
        String choice = input.nextLine();
        if(choice.equalsIgnoreCase("1")){
            runPhoneBookApp(phoneBook);
        }
        
    }
    public static void displaySearchContactMenu() {
        System.out.print("Enter name: ");
        input.nextLine();
        String name = input.nextLine();
        phoneBook.searchContact(name);
        
        System.out.println("""
                            1.Go back to the Main menu
                            2.Exit
                            """);
        System.out.print("Select an option: ");
        String choice = input.nextLine();
        if(choice.equalsIgnoreCase("1")) {
            runPhoneBookApp(phoneBook);
        }
    }
    public static void displayViewExistingContactsMenu() {
        phoneBook.displayContacts();
        input.nextLine();
        System.out.println("""
                            1.Go back to the Main menu
                            2.Exit
                            """);
        System.out.print("Select an option: ");
        String choice = input.nextLine();
        if(choice.equalsIgnoreCase("1")) {
            runPhoneBookApp(phoneBook);
        }
        
    }

    public static void displayEditContactMenu() {
        input.nextLine();
        System.out.print("Enter name:");
        String nameToCheck = input.nextLine();

        System.out.print("Enter new name: ");
        String newName= input.nextLine();

        phoneBook.setName(newName);

        System.out.print("Enter new phone number: ");
        String newPhoneNumber = input.nextLine();
        phoneBook.setPhoneNumber(newPhoneNumber);

        phoneBook.editContactFromPhoneBook(nameToCheck);
        System.out.println("""
                            1.Go back to the Main menu
                            2.Exit
                            """);
        System.out.print("Select an option: ");
        String choice = input.nextLine();
        if(choice.equalsIgnoreCase("1")) {
            runPhoneBookApp(phoneBook);
        }

    }

}


