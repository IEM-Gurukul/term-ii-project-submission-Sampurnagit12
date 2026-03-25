public abstract class Appointment {

    protected Patient patient;
    protected Doctor doctor;
    protected String dateTime;

    public Appointment(Patient patient, Doctor doctor, String dateTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
    }

    // Abstract method
    public abstract void bookAppointment();
}