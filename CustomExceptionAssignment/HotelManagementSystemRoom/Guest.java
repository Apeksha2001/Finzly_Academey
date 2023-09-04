package CustomExceptionAssignment.HotelManagementSystemRoom;

import java.util.ArrayList;
import java.util.List;

class Guest {
    private int guestId;
    private String name;
    private List<Reservation> reservations;

    public Guest(int guestId, String name) {
        this.guestId = guestId;
        this.name = name;
        this.reservations = new ArrayList<>();
    }

    public int getGuestId() {
        return guestId;
    }


    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void displayGuestDetails() {
        System.out.println("Guest ID: " + guestId);
        System.out.println("Guest Name: " + name);
        System.out.println("Reservations:");

        for (Reservation reservation : reservations) {
            reservation.displayDetails();
        }
    }
}
