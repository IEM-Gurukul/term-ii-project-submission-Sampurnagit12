import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileHandler {

    //Save Patient Data
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
}