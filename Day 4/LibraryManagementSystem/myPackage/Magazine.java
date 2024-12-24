package myPackage;

import java.util.InputMismatchException;

public class Magazine extends LibraryItem{
    private String editor;
    
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) throws InputMismatchException {
        if (editor.isEmpty()) {
            throw new InputMismatchException();
        }
        this.editor = editor;
    }
  
    @Override
    public void getLibraryItemDetails() {
        super.getLibraryItemDetails();
        System.out.println("Editor: "+editor);
    }
}
