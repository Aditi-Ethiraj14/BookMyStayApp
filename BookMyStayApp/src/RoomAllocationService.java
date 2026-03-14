import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * CLASS - RoomAllocationService
 *
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Ensures:
 * - Unique room IDs
 * - No double booking
 * - Immediate inventory update
 */

public class RoomAllocationService {

    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
    }

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String roomType = reservation.getRoomType();
        Map<String, Integer> availability = inventory.getRoomAvailability();

        Integer availableRooms = availability.get(roomType);

        if (availableRooms == null) {
            System.out.println("Invalid room type requested: " + roomType);
            return;
        }

        if (availableRooms > 0) {

            String roomId = generateRoomId(roomType);

            allocatedRoomIds.add(roomId);

            assignedRoomsByType
                .computeIfAbsent(roomType, k -> new HashSet<>())
                .add(roomId);

            inventory.updateAvailability(roomType, availableRooms - 1);

            System.out.println(
                "Booking confirmed for Guest: "
                + reservation.getGuestName()
                + ", Room ID: "
                + roomId
            );

        } else {

            System.out.println(
                "No rooms available for Guest: "
                + reservation.getGuestName()
                + " (Requested: " + roomType + ")"
            );
        }
    }

    private String generateRoomId(String roomType) {

        int count = assignedRoomsByType
                        .getOrDefault(roomType, new HashSet<>())
                        .size() + 1;

        String roomId = roomType + "-" + count;

        while (allocatedRoomIds.contains(roomId)) {
            count++;
            roomId = roomType + "-" + count;
        }

        return roomId;
    }
}
