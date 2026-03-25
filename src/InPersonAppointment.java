public class InPersonAppointment extends Appointment {

    public InPersonAppointment(Patient patient, Doctor doctor, String dateTime) {
        super(patient, doctor, dateTime);
    }

    @Override
    public void bookAppointment() {
        System.out.println("In-Person Appointment Booked");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Date & Time: " + dateTime);
    }
}