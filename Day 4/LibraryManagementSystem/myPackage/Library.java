package myPackage;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
public class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<Client> clients;

   public Library() {
       items = new ArrayList<>();
       clients = new ArrayList<>();
   }

   public boolean itemsEmpty() {
       return items.isEmpty();
   }

   public boolean clientsEmpty() {
       return clients.isEmpty();
   }

   public void checkIfIdExistsinItems(int id) throws IdExistsException {
       for (LibraryItem libraryItem : items) {
           if (libraryItem.getId() == id) {
               throw new IdExistsException();
           }
       }
   }
   public void checkIfIdExistsinClient(int id) throws IdExistsException {
    for (Client client : clients) {
        if (client.getId() == id) {
            throw new IdExistsException();
        }
    }
}
   public void addItem(LibraryItem libraryItem) {
       items.add(libraryItem);
   }
   public void addClient(Client client) {
    clients.add(client);
}

public void removeItem(int ID) throws LibraryItemNotFoundException {
    if (items.isEmpty()) {
        System.out.println("No items in the library");
        return;
    }
    Iterator<LibraryItem> iterator = items.iterator();
    boolean found = false;
    while (iterator.hasNext()) {
        LibraryItem item = iterator.next();
        if (item.getId() == ID) {
            iterator.remove();
            found = true;
            break;
        }
    }
    if (!found) {
        throw new LibraryItemNotFoundException();
    }
}

public void removeClient(int ID) throws LibraryItemNotFoundException {
    if (clients.isEmpty()) {
        System.out.println("No clients in the library");
        return;
    }
    Iterator<Client> iterator = clients.iterator();
    boolean found = false;
    while (iterator.hasNext()) {
        Client client = iterator.next();
        if (client.getId() == ID) {
            iterator.remove();
            found = true;
            break;
        }
    }
    if (!found) {
        throw new LibraryItemNotFoundException();
    }
}

public void displayLibrary() {
    if(items.isEmpty()){
        System.out.println("No items in the library");
        return;
    }
    System.out.println("*************");
    for (LibraryItem libraryItem : items) {
        libraryItem.getLibraryItemDetails();
        System.out.println("*************");
    }
}
   
public void displayClients() {
    if(clients.isEmpty()){
        System.out.println("No clients in the library");
        return;
    }
    System.out.println("*************");
    for (Client client : clients) {
        client.getClientDetails();
        System.out.println("*************");

    }
}

   public void displayLibraryItem(int ID) throws LibraryItemNotFoundException {
    boolean found = false;
    for (LibraryItem libraryItem : items) {
        if (libraryItem.getId() == ID) {
            libraryItem.getLibraryItemDetails();
            found = true;
        }
    }
    if (!found)
        throw new LibraryItemNotFoundException();
   }
}
