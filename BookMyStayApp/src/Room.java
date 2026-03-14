/**
 * ======================================================
 * CLASS - Room
 * ======================================================
 *
 * Represents a generic room in the hotel.
 *
 * @version 4.0
 */

public class Room {

    private int beds;
    private int size;
    private double pricePerNight;

    /**
     * Constructor for Room
     */
    public Room(int beds, int size, double pricePerNight) {
        this.beds = beds;
        this.size = size;
        this.pricePerNight = pricePerNight;
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
