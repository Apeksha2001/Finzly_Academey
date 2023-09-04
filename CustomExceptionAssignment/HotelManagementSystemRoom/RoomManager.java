package CustomExceptionAssignment.HotelManagementSystemRoom;

import java.util.HashMap;
import java.util.Map;

public class RoomManager{
    private Map<Integer, Room> rooms;

        public RoomManager() {
            rooms = new HashMap<>();
        }

        public void addRoom(Room room) {
            rooms.put(room.getRoomNumber(), room);
        }

        public Room getRoom(int roomNumber) {
            return rooms.get(roomNumber);
        }

        public void bookRoom(int roomNumber) throws RoomNotFoundException, InvalidReservationException {
            Room room = getRoom(roomNumber);
            if (room != null) {
                try {
                    room.bookRoom();
                    System.out.println("Room " + roomNumber + " booked successfully.");
                } catch (InvalidReservationException e) {
                    throw e;
                }
            } else {
                throw new RoomNotFoundException("Room " + roomNumber + " not found.");
            }
        }

        public void releaseRoom(int roomNumber) throws RoomNotFoundException, InvalidReservationException {
            Room room = getRoom(roomNumber);
            if (room != null) {
                try {
                    room.releaseRoom();
                    System.out.println("Room " + roomNumber + " released.");
                } catch (InvalidReservationException e) {
                    throw e;
                }
            } else {
                throw new RoomNotFoundException("Room " + roomNumber + " not found.");
            }
        }
}