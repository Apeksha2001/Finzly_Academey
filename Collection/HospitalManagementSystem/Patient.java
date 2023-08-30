package Collection.HospitalManagementSystem;

public class Patient {
    private String patientName;
    private int patientAge;
    private int patientID;
    private String disease;

    public Patient(String patientName, int patientAge, int patientID,String disease) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientID=patientID;
        this.disease=disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                ", patientID=" + patientID +
                ", disease='" + disease + '\'' +
                '}';
    }
}
