public class TelehealthAppointment extends Appointment {

    public TelehealthAppointment(Patient patient, Doctor doctor, String dateTime) {
        super(patient, doctor, dateTime);
    }

    @Override
    public void bookAppointment() {
        System.out.println("Telehealth Appointment Booked (Online)");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Date & Time: " + dateTime);
    }
}