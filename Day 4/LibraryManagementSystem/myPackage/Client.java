package myPackage;

import java.util.InputMismatchException;

public class Client {
    private int id;
    private String name;
    private String email;

    public Client() {
        id = 0;
        name = "";
        email = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InputMismatchException {
        if (name.isEmpty()) {
            throw new InputMismatchException();
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InputMismatchException {
        if (email.isEmpty() || !email.contains("@") || !email.contains(".com")) {
            throw new InputMismatchException(); 
        }
        this.email = email;
    }

    public void getClientDetails() {
        System.out.println("Client ID: " + id);
        System.out.println("Client name:"+name);
        System.out.println("Client email: "+email);
        
    }
}
