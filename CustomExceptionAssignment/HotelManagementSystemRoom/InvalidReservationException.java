package CustomExceptionAssignment.HotelManagementSystemRoom;

// Custom Exceptions
class InvalidReservationException extends Exception {
    public InvalidReservationException(String message) {
        super(message);
    }
}