public class Patient {

    // Encapsulation: private variables
    private String name;
    private String username;
    private String password;

    // Constructor
    public Patient(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}