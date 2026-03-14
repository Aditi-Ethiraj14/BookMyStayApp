/**
 * ==========================================================
 * CLASS - Room
 * ==========================================================
 *
 * Description:
 * Represents a hotel room type and its characteristics.
 *
 * This class contains only room properties such as
 * number of beds, room size, and price per night.
 *
 * Inventory availability is NOT stored here.
 *
 * @version 3.0
 */

public class Room {

    private String type;
    private int beds;
    private int size;
    private double pricePerNight;

    /**
     * Constructor
     */
    public Room(String type, int beds, int size, double pricePerNight) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.pricePerNight = pricePerNight;
    }

    public String getType() {
        return type;
    }

    public int getBeds() {
        return beds;
    }

    public int getSize() {
        return size;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}
