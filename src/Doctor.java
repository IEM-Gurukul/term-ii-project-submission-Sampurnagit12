public class Doctor extends Person {

    private String specialization;

    // Constructor
    public Doctor(String name, String id, String specialization) {
        super(name, id);  // calling parent constructor
        this.specialization = specialization;
    }

    // Override abstract method
    @Override
    public void displayInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Specialization: " + specialization);
    }

    public String getSpecialization() {
        return specialization;
    }
}