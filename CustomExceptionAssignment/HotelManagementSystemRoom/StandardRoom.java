package CustomExceptionAssignment.HotelManagementSystemRoom;

class StandardRoom extends Room {

    public StandardRoom(int roomNumber, double costPerNight) {
        super(roomNumber, costPerNight);
    }

    @Override
    public void displayRoomInfo() {
        System.out.println("Room Type: Standard");
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Cost Per Night: $" + getCostPerNight());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Booked"));
    }
}