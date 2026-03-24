import javax.swing.*;
import java.awt.*;

public class RegisterPage {

    JFrame frame;
    JTextField nameField, usernameField;
    JPasswordField passwordField;
    JButton registerButton;

    public RegisterPage() {

        frame = new JFrame("Register - Hospital System");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        nameField = new JTextField();
        usernameField = new JTextField();
        passwordField = new JPasswordField();

        registerButton = new JButton("Register");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(userLabel);
        frame.add(usernameField);
        frame.add(passLabel);
        frame.add(passwordField);
        frame.add(registerButton);

        // Button Action
        registerButton.addActionListener(e -> {

            String name = nameField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Create Patient Object
            String id = "P" + System.currentTimeMillis(); // simple unique ID
            Patient patient = new Patient(name, id, username, password);

            JOptionPane.showMessageDialog(frame, "Registration Successful!");

            System.out.println("Patient Registered: " + patient.getName());
        });

        frame.setVisible(true);
    }
}