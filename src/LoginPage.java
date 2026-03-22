import javax.swing.*;
import java.awt.*;

public class LoginPage {

    JFrame frame;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton, registerButton;

    public LoginPage() {

        // Create frame
        frame = new JFrame("Login - Hospital System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        // Add components to frame
        frame.add(userLabel);
        frame.add(usernameField);
        frame.add(passLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(registerButton);

        registerButton.addActionListener(e -> {
    frame.dispose(); // close login
    new RegisterPage();
     });

        // Make visible
        frame.setVisible(true);

    }
}