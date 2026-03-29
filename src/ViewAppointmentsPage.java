import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewAppointmentsPage {

    JFrame frame;
    JTextArea textArea;

    public ViewAppointmentsPage(Patient patient) {

        frame = new JFrame("Your Appointments");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane, BorderLayout.CENTER);

        // Load appointments
        ArrayList<String> appointments = FileHandler.loadAppointments(patient.getName());

        if (appointments.isEmpty()) {
            textArea.setText("No appointments found.");
        } else {
            StringBuilder sb = new StringBuilder();

            for (String app : appointments) {
                sb.append(app).append("\n");
            }

            textArea.setText(sb.toString());
        }

        frame.setVisible(true);
    }
}