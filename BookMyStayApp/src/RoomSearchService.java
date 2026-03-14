import java.util.Map;

/**
 * ==========================================================
 * CLASS - RoomSearchService
 * ==========================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Description:
 * This class provides search functionality
 * for guests to view available rooms.
 *
 * It reads room availability from inventory
 * and room details from Room objects.
 *
 * No inventory mutation or booking logic
 * is performed in this class.
 *
 * @version 4.0
 */

public class RoomSearchService {

    /**
     * Displays available rooms along with
     * their details and pricing.
     *
     * @param inventory centralized room inventory
     * @param singleRoom single room definition
     * @param doubleRoom double room definition
     * @param suiteRoom suite room definition
     */

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Room Search\n");

        // Check Single Room availability
        if (availability.get("Single Room") > 0) {

            System.out.println("Single Room:");
            System.out.println("Beds: " + singleRoom.getBeds());
            System.out.println("Size: " + singleRoom.getSize() + " sqft");
            System.out.println("Price per night: " + singleRoom.getPricePerNight());
            System.out.println("Available: " + availability.get("Single Room"));
            System.out.println();
        }

        // Check Double Room availability
        if (availability.get("Double Room") > 0) {

            System.out.println("Double Room:");
            System.out.println("Beds: " + doubleRoom.getBeds());
            System.out.println("Size: " + doubleRoom.getSize() + " sqft");
            System.out.println("Price per night: " + doubleRoom.getPricePerNight());
            System.out.println("Available: " + availability.get("Double Room"));
            System.out.println();
        }

        // Check Suite Room availability
        if (availability.get("Suite Room") > 0) {

            System.out.println("Suite Room:");
            System.out.println("Beds: " + suiteRoom.getBeds());
            System.out.println("Size: " + suiteRoom.getSize() + " sqft");
            System.out.println("Price per night: " + suiteRoom.getPricePerNight());
            System.out.println("Available: " + availability.get("Suite Room"));
            System.out.println();
        }
    }
}
