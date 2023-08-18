/*Method Overriding and Overloading: Build a reservation system for a hotel. Create a class Room with properties like roomNumber,
 capacity, and price Per Night. Implement methods to check availability and make a reservation. Override the toString() method to
  provide a customized string representation of a room. Implement method overloading for reservation methods to handle different scenarios,
  like reserving with or without specific check-in/check-out dates.
 */
package JBKTest1;

import java.util.Date;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

class Room {
    private int roomNumber;
    private int capacity;
    private double pricePerNight;
    private boolean isReserved;

    public Room(int roomNumber, int capacity, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }

    public boolean checkAvailability() {
        return !isReserved;
    }

    public void makeReservation() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Room " + roomNumber + " has been reserved.");
        } else {
            System.out.println("Room " + roomNumber + " is already reserved.");
        }
    }

    public void makeReservation(Date checkInDate, Date checkOutDate) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Room " + roomNumber + " has been reserved from " + checkInDate + " to " + checkOutDate + ".");
        } else {
            System.out.println("Room " + roomNumber + " is already reserved.");
        }
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + ", Capacity: " + capacity + ", Price per Night: $" + pricePerNight;
    }
}

public class OverloadingOverriding {
    public static void main(String[] args) {
        Room room101 = new Room(101, 2, 150.0);
        Room room102 = new Room(102, 4, 200.0);
        Room room103   =new Room(103,7,500);

        System.out.println(room101);
        System.out.println(room102);
        System.out.println(room103);

        room101.makeReservation(new Date(), new Date(System.currentTimeMillis() + 86400000));
        room102.makeReservation(new Date(), new Date(System.currentTimeMillis() + 172800000));

        Instant checkInInstant = Instant.now();
        Instant checkOutInstant = checkInInstant.plus(2, ChronoUnit.DAYS);

        room103.makeReservation(Date.from(checkInInstant), Date.from(checkOutInstant));

        room101.makeReservation(Date.from(checkInInstant), Date.from(checkOutInstant));
        System.out.printf("*******");
        room102.makeReservation();
        System.out.println("******");


        room101.makeReservation(new Date(), new Date(System.currentTimeMillis() + 86400000)); // Adding 1 day in milliseconds

        System.out.println(room101);
        System.out.println(room102);
    }
}

