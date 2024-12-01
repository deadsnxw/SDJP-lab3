/**
 * The SportInventory class represents sports equipment with several properties.
 */
public class SportInventory implements Comparable<SportInventory> {
    private String name; // Name of the equipment
    private String type; // Type of equipment (e.g., ball, racket)
    private double price; // Price of the equipment
    private double weight; // Weight of the equipment
    private int stock; // Quantity in stock

    /**
     * Constructor for creating a sports equipment object.
     *
     * @param name  Name of the equipment
     * @param type  Type of equipment
     * @param price Price of the equipment
     * @param weight Weight of the equipment
     * @param stock Quantity in stock
     */
    public SportInventory(String name, String type, double price, double weight, int stock) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.stock = stock;
    }

    // Getters and setters for the fields
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return String.format("SportInventory{name='%s', type='%s', price=%.2f, weight=%.2f, stock=%d}",
                name, type, price, weight, stock);
    }

    /**
     * Default implementation of object comparison.
     * Compared by name in alphabetical order.
     */
    @Override
    public int compareTo(SportInventory other) {
        return this.name.compareTo(other.name);
    }
}