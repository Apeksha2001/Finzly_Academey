package CustomExceptionAssignment.HotelManagementSystemRoom;

class RoomNotFoundException extends Exception {
    public RoomNotFoundException(String message) {
        super(message);
    }
}