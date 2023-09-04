package CustomExceptionAssignment.HotelManagementSystemRoom;

class SpaReservation extends Reservation {
    private String treatment;

    public SpaReservation(int reservationId, double cost, String treatment) {
        super(reservationId, cost, "Spa Reservation");
        this.treatment = treatment;
    }

    @Override
    public void displayDetails() {
        System.out.println("Reservation ID: " + getReservationId());
        System.out.println("Reservation Type: " + getReservationType());
        System.out.println("Spa Treatment: " + treatment);
        System.out.println("Cost: $" + getCost());
    }
}