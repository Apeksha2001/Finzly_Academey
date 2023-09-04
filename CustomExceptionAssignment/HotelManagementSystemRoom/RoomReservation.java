package CustomExceptionAssignment.HotelManagementSystemRoom;


class RoomReservation extends Reservation {
    private int roomNumber;
    private String roomType;

    public RoomReservation(int reservationId, double cost, int roomNumber, String roomType) {
        super(reservationId, cost, "Room Reservation");
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Reservation ID: " + getReservationId());
        System.out.println("Reservation Type: " + getReservationType());
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Cost: $" + getCost());
    }
}