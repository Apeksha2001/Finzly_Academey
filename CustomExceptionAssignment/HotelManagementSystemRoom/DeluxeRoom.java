package CustomExceptionAssignment.HotelManagementSystemRoom;

class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber, double costPerNight) {
        super(roomNumber, costPerNight);
    }

    @Override
    public void displayRoomInfo() {
        System.out.println("Room Type: Deluxe");
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Cost Per Night: $" + getCostPerNight());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Booked"));
    }
}