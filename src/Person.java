public abstract class Person {

    protected String name;
    protected String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method (no body)
    public abstract void displayInfo();
    public String getName() {
        return name;
    }
}