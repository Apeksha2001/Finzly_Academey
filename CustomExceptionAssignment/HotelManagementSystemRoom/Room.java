package CustomExceptionAssignment.HotelManagementSystemRoom;

abstract class Room {
    private int roomNumber;
    private double costPerNight;
    private boolean isAvailable;

    public Room(int roomNumber, double costPerNight) {
        this.roomNumber = roomNumber;
        this.costPerNight = costPerNight;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() throws InvalidReservationException {
        if (!isAvailable()) {
            throw new InvalidReservationException("Room is already booked.");
        }
        isAvailable = false;
    }

    public void releaseRoom() throws InvalidReservationException {
        if (isAvailable()) {
            throw new InvalidReservationException("Room is not booked.");
        }
        isAvailable = true;
    }

    public abstract void displayRoomInfo();
}