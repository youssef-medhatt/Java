package myPackage;

import java.util.InputMismatchException;

public abstract class LibraryItem {
    protected int id;
    protected String title;
    protected int price;

    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) throws InputMismatchException {
        if (title.isEmpty()) {
            throw new InputMismatchException(); 
        }
        this.title = title;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public void getLibraryItemDetails() {
        System.out.println("Item No: " + id);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }

}
