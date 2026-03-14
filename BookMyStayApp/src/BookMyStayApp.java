/**
 * ======================================================
 * MAIN CLASS - UseCase6RoomAllocation
 * ======================================================
 *
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Description:
 * This class demonstrates how booking
 * requests are confirmed and rooms
 * are allocated safely.
 *
 * It consumes booking requests in FIFO
 * order and updates inventory immediately.
 *
 * @version 6.0
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        RoomInventory inventory = new RoomInventory();

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Use SAME room names as inventory
        bookingQueue.addRequest(new Reservation("Abhi", "Single Room"));
        bookingQueue.addRequest(new Reservation("Subha", "Single Room"));
        bookingQueue.addRequest(new Reservation("Vanmathi", "Suite Room"));

        RoomAllocationService allocationService = new RoomAllocationService();

        while (bookingQueue.hasPendingRequests()) {

            Reservation reservation = bookingQueue.getNextRequest();

            allocationService.allocateRoom(reservation, inventory);
        }
    }
}
