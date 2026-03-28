import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    // Save Patient Data
    public static void savePatient(Patient patient) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("patients.txt", true))) {

            String data = patient.getName() + "," +
                          patient.getUsername() + "," +
                          patient.getPassword();

            writer.write(data);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error saving patient: " + e.getMessage());
        }
    }

    // Save Appointment Data
    public static void saveAppointment(Appointment appointment) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("appointments.txt", true))) {

            String data = appointment.patient.getName() + "," +
                          appointment.doctor.getName() + "," +
                          appointment.dateTime;

            writer.write(data);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error saving appointment: " + e.getMessage());
        }
    }

    // Load Patient Data
    public static ArrayList<Patient> loadPatients() {

    ArrayList<Patient> patients = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("patients.txt"))) {

        String line;

        while ((line = reader.readLine()) != null) {

            if (line.trim().isEmpty()) continue;

            String[] parts = line.split(",");

            if (parts.length < 3) continue;

            String name = parts[0].trim();
            String username = parts[1].trim();
            String password = parts[2].trim();

            Patient patient = new Patient(name, username, password);
            patients.add(patient);
        }

    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }

    return patients;
    }
}