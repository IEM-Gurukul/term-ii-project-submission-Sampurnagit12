import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        // Create a new window (frame)
        JFrame frame = new JFrame("Hospital Appointment System");

        // Set size of the window
        frame.setSize(500, 400);

        // Close application when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make window visible
        frame.setVisible(true);
    }
}