import java.util.Map;

/**
 * ==========================================================
 * MAIN CLASS - UseCase3InventorySetup
 * ==========================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class demonstrates how room availability
 * is managed using a centralized inventory.
 *
 * Room objects are used to retrieve pricing
 * and room characteristics.
 *
 * No booking or search logic is introduced here.
 *
 * @version 3.1
 */

public class BookMyStayApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Create Room objects
        Room singleRoom = new Room("Single Room", 1, 250, 1500.0);
        Room doubleRoom = new Room("Double Room", 2, 400, 2500.0);
        Room suiteRoom = new Room("Suite Room", 3, 750, 5000.0);

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Get availability map
        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Hotel Room Inventory Status\n");

        displayRoom(singleRoom, availability.get(singleRoom.getType()));
        displayRoom(doubleRoom, availability.get(doubleRoom.getType()));
        displayRoom(suiteRoom, availability.get(suiteRoom.getType()));
    }

    /**
     * Displays room details and availability.
     */
    private static void displayRoom(Room room, int availableRooms) {

        System.out.println(room.getType() + ":");
        System.out.println("Beds: " + room.getBeds());
        System.out.println("Size: " + room.getSize() + " sqft");
        System.out.println("Price per night: " + room.getPricePerNight());
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println();
    }
}
