package myPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static Library library = new Library();
    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("1.Add Book");
        System.out.println("2.Add Magazine");
        System.out.println("3.Add Client");
        System.out.println("4.Display library");
        System.out.println("5.Display all clinets");
        System.out.println("6.Delete item");
        System.out.println("7.Delete client");
    }

    public static void addBook() {
        Book book = new Book();
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter book id:");
                int id = scanner.nextInt();
                library.checkIfIdExistsinItems(id);
                book.setId(id);
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                validInput = false;
                System.out.println("Please enter a valid Number.");
            }
            catch (IdExistsException e) {
                scanner.nextLine();
                validInput = false;
                System.out.println("ID already exists.");
            }
            
        }
        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter book title:");
                book.setTitle(scanner.nextLine());
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                System.out.println("Please enter a valid title.");
            }
        }
        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter book price:");
                book.setPrice(scanner.nextInt());
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                validInput = false;
                System.out.println("Please enter a valid Number.");
            }
        }
        validInput = false;
        while (!validInput) {

            try {
                System.out.println("Enter book author:");
                book.setAuthor(scanner.nextLine());
                validInput = true;

                } catch (InputMismatchException e) {
                validInput = false;
                System.out.println("Please enter a valid author.");
            }
        }

        library.addItem(book);
    }

    public static void addMagazine() {
        Magazine magazine = new Magazine();
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter magazine id:");
                int id = scanner.nextInt();
                library.checkIfIdExistsinItems(id);
                magazine.setId(id);
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                validInput = false;
                System.out.println("Please enter a valid Number.");
            }
            catch (IdExistsException e) {
                scanner.nextLine();
                validInput = false;
                System.out.println("ID already exists.");
            }
        }
        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter magazine title:");
                magazine.setTitle(scanner.nextLine());
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                System.out.println("Please enter a valid title.");
            }
        }
        validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter magazine price:");
                magazine.setPrice(scanner.nextInt());
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                validInput = false;
                System.out.println("Please enter a valid Number.");
            }
        }
        validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter magazine editor:");
                magazine.setEditor(scanner.nextLine());
                validInput = true;

            } catch (InputMismatchException e) {
                validInput = false;
                System.out.println("Please enter a valid editor.");
            }

        }
        library.addItem(magazine);
    }

    public static void addClient() {
        Client client = new Client();
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter client id:");
                int id = scanner.nextInt();
                library.checkIfIdExistsinClient(id);
                client.setId(id);
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                validInput = false;
                System.out.println("Please enter a valid Number.");
            }
            catch (IdExistsException e) {
                scanner.nextLine();
                validInput = false;
                System.out.println("ID already exists.");
            }
        }
        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter client name:");
                client.setName(scanner.nextLine());
                validInput = true;

            } catch (InputMismatchException e) {
                validInput = false;
                System.out.println("Please enter a valid name.");
            }

        }
        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter client email:");
                client.setEmail(scanner.nextLine());
                validInput = true;

            } catch (InputMismatchException e) {
                validInput = false;
                System.out.println("Please enter a valid email.");
            }

        }
        library.addClient(client);
    }

    public static void displayLibrary() {
        library.displayLibrary();
    }

    public static void displayClients() {
        library.displayClients();
    }

    public static void deleteItem() {
        if(library.itemsEmpty()) {
            System.out.println("No items in the library");
            return;
        }
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter ID you want to delete:");
                library.removeItem(scanner.nextInt());
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();

                System.out.println("Please enter a valid Number:");
                validInput = false;
            } catch (LibraryItemNotFoundException e) {
                scanner.nextLine();

                System.out.println("No ID matches the one you entered!");
                validInput = false;
            }
        }
    }

    public static void deleteClient() {
        
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter ID you want to delete:");
                library.removeClient(scanner.nextInt());
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter a valid Number:");
                validInput = false;
            } catch (LibraryItemNotFoundException e) {
                scanner.nextLine();

                System.out.println("No ID matches the one you entered!");
                validInput = false;
            }
        }
    }

   
}
