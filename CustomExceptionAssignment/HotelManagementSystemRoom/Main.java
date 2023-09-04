package CustomExceptionAssignment.HotelManagementSystemRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RoomManager roomManager = new RoomManager();
        roomManager.addRoom(new StandardRoom(101, 100.0));
        roomManager.addRoom(new DeluxeRoom(102, 150.0));
        roomManager.addRoom(new SuiteRoom(201, 250.0));

        List<Guest> guests = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create a new guest");
            System.out.println("2. Book a room");
            System.out.println("3. Release a room");
            System.out.println("4. Display guest information");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter guest ID: ");
                    int guestId = scanner.nextInt();
                    System.out.print("Enter guest name: ");
                    String guestName = scanner.next();
                    Guest newGuest = new Guest(guestId, guestName);
                    guests.add(newGuest);
                    System.out.println("Guest created successfully.");
                    break;
                case 2:
                    System.out.print("Enter guest ID: ");
                    int guestIdToBook = scanner.nextInt();
                    Guest guestToBook = findGuestById(guests, guestIdToBook);
                    if (guestToBook != null) {
                        System.out.print("Enter room number to book: ");
                        int roomNumberToBook = scanner.nextInt();
                        try {
                            roomManager.bookRoom(roomNumberToBook);
                            RoomReservation roomReservation = new RoomReservation(guestToBook.getGuestId(), 100.0, roomNumberToBook, "Standard");
                            guestToBook.addReservation(roomReservation);
                            System.out.println("Room booked successfully.");
                        } catch (RoomNotFoundException | InvalidReservationException e) {
                            System.err.println("Error: " + e.getMessage());
                        }
                    } else {
                        System.err.println("Guest not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter guest ID: ");
                    int guestIdToRelease = scanner.nextInt();
                    Guest guestToRelease = findGuestById(guests, guestIdToRelease);
                    if (guestToRelease != null) {
                        System.out.print("Enter room number to release: ");
                        int roomNumberToRelease = scanner.nextInt();
                        try {
                            roomManager.releaseRoom(roomNumberToRelease);
                            System.out.println("Room released successfully.");
                        } catch (RoomNotFoundException | InvalidReservationException e) {
                            System.err.println("Error: " + e.getMessage());
                        }
                    } else {
                        System.err.println("Guest not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter guest ID: ");
                    int guestIdToDisplay = scanner.nextInt();
                    Guest guestToDisplay = findGuestById(guests, guestIdToDisplay);
                    if (guestToDisplay != null) {
                        guestToDisplay.displayGuestDetails();
                    } else {
                        System.err.println("Guest not found.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Hotel Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    private static Guest findGuestById(List<Guest> guests, int guestId) {
        for (Guest guest : guests) {
            if (guest.getGuestId() == guestId) {
                return guest;
            }
        }
        return null;
    }
}
