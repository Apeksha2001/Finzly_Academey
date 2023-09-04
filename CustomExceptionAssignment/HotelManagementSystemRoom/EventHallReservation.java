package CustomExceptionAssignment.HotelManagementSystemRoom;

class EventHallReservation extends Reservation {
    private String eventName;

    public EventHallReservation(int reservationId, double cost, String eventName) {
        super(reservationId, cost, "Event Hall Reservation");
        this.eventName = eventName;
    }

    @Override
    public void displayDetails() {
        System.out.println("Reservation ID: " + getReservationId());
        System.out.println("Reservation Type: " + getReservationType());
        System.out.println("Event Name: " + eventName);
        System.out.println("Cost: $" + getCost());
    }
}