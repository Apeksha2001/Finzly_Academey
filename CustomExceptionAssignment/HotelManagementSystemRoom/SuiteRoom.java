package CustomExceptionAssignment.HotelManagementSystemRoom;

class SuiteRoom extends Room {
    public SuiteRoom(int roomNumber, double costPerNight) {
        super(roomNumber, costPerNight);
    }

    @Override
    public void displayRoomInfo() {
        System.out.println("Room Type: Suite");
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Cost Per Night: $" + getCostPerNight());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Booked"));
    }
}