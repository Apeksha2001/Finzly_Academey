package CustomExceptionAssignment.HotelManagementSystemRoom;
abstract class Reservation {
    private int reservationId;
    private double cost;
    private String reservationType;

    public Reservation(int reservationId, double cost, String reservationType) {
        this.reservationId = reservationId;
        this.cost = cost;
        this.reservationType = reservationType;
    }

    public abstract void displayDetails();

    public int getReservationId() {
        return reservationId;
    }

    public double getCost() {
        return cost;
    }

    public String getReservationType() {
        return reservationType;
    }
}
