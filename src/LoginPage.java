import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LoginPage {

    JFrame frame;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton, registerButton;

    public LoginPage() {

        frame = new JFrame("Login Page");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(3, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        frame.add(userLabel);
        frame.add(usernameField);
        frame.add(passLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(registerButton);

        // LOGIN LOGIC (Day 8)
        loginButton.addActionListener(e -> {

            try {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Validation
                if (username.isEmpty() || password.isEmpty()) {
                    throw new Exception("Fields cannot be empty!");
                }

                // Load patients from file
                ArrayList<Patient> patients = FileHandler.loadPatients();

                boolean found = false;
                Patient loggedInPatient = null;

                // Check credentials
                for (Patient p : patients) {
                     System.out.println("Entered: " + username + " " + password);
                     System.out.println("File: " + p.getUsername() + " " + p.getPassword());
                    if (p.getUsername().equals(username) && p.getPassword().equals(password)) {
                        found = true;
                        loggedInPatient = p;
                        break;
                    }
                }

                if (found) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");

                    // Go to Booking Page
                    new BookingPage(loggedInPatient);
                    frame.dispose();

                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password!");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        });

        // Register Button → Open Register Page
        registerButton.addActionListener(e -> {
            new RegisterPage();
            frame.dispose();
        });


        frame.setVisible(true);
    }
}