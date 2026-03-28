public class Patient extends Person {

    private String username;
    private String password;

    public Patient(String name, String username, String password) {
        super(name, ""); // empty id (not used)
        this.username = username;
        this.password = password;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient Name: " + name);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}