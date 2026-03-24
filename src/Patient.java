public class Patient extends Person {

    // Encapsulation: private variables
    private String username;
    private String password;

    // Constructor
    public Patient(String name, String id, String username, String password) {
        super(name,id);
        this.username = username;
        this.password = password;
    }

     @Override
    public void displayInfo() {
        System.out.println("Patient Name: " + name);
        System.out.println("ID: " + id);
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}