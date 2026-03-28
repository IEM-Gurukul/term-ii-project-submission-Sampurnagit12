import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BookingPage {

    JFrame frame;
    JComboBox<String> doctorBox, typeBox;
    JTextField dateField;
    JButton bookButton;

    Patient patient;

    //ArrayList to store appointments
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public BookingPage(Patient patient) {

        this.patient = patient;

        frame = new JFrame("Book Appointment");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel doctorLabel = new JLabel("Select Doctor:");
        JLabel typeLabel = new JLabel("Appointment Type:");
        JLabel dateLabel = new JLabel("Date & Time:");

        doctorBox = new JComboBox<>(new String[]{
                "Dr. Susmita Roy - Cardiology",
                "Dr. Niharika Banerjee - Neurology",                
                "Dr. Sreyansh Das - Child Specialist"
        });

        typeBox = new JComboBox<>(new String[]{
                "In-Person",
                "Telehealth"
        });

        dateField = new JTextField();

        bookButton = new JButton("Book");

        frame.add(doctorLabel);
        frame.add(doctorBox);
        frame.add(typeLabel);
        frame.add(typeBox);
        frame.add(dateLabel);
        frame.add(dateField);
        frame.add(bookButton);

        //Button Action
        bookButton.addActionListener(e -> {

            try {
                String doctorName = (String) doctorBox.getSelectedItem();
                String type = (String) typeBox.getSelectedItem();
                String date = dateField.getText();

                // Validation (Exception Handling)
                if (date.isEmpty()) {
                    throw new Exception("Date & Time cannot be empty!");
                }

                int index = doctorBox.getSelectedIndex();

                Doctor doctor;

                if (index == 0) {
                doctor = new Doctor("Dr. Susmita Roy", "D101", "Cardiology");

                } else if (index == 1) {
                  doctor = new Doctor("Dr. Niharika Banerjee", "D102", "Neurology");

                } else {
                  doctor = new Doctor("Dr. Sreyansh Das", "D103", "Child Specialist");
                }

                Appointment appointment;

                //Polymorphism
                if (type.equals("In-Person")) {
                    appointment = new InPersonAppointment(patient, doctor, date);
                } else {
                    appointment = new TelehealthAppointment(patient, doctor, date);
                }

                //Store in ArrayList
                appointments.add(appointment);

                FileHandler.saveAppointment(appointment);

                appointment.bookAppointment();

                JOptionPane.showMessageDialog(frame, "Appointment Booked Successfully!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        });

        frame.setVisible(true);
    }
}