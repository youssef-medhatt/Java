package myPackage;

import java.util.InputMismatchException;

public class Book extends LibraryItem {
    private String author;
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws InputMismatchException {
        if (author.isEmpty()) {
            throw new InputMismatchException();
        }
        this.author = author;
    }
  
    @Override
    public void getLibraryItemDetails() {
        super.getLibraryItemDetails();
        System.out.println("Author: "+author);
    }




}
