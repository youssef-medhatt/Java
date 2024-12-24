import java.util.Scanner;

import myPackage.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library!");
    outer:    while (true) {

            Menu.displayMenu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Menu.addBook();
                    break;
                case 2:
                    Menu.addMagazine();
                    break;
                case 3:
                    Menu.addClient();
                    break;
                case 4:
                    Menu.displayLibrary();
                    break;

                case 5:
                    Menu.displayClients();
                    break;
                case 6:
                    Menu.deleteItem();
                    break;
                case 7:
                    Menu.deleteClient();
                    break;
                default:
                    break;
            }
            while (true) {
                System.out.println("Do you want to continue? (y/n)");
                char c = scanner.next().charAt(0);
                if (c == 'n') {
                    break outer;
                } else if (c == 'y') {
                    break;
                } else {
                    System.out.println("Invalid input");
                }
                
            }

            

        }
    }
}
