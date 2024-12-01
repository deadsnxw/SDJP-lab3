import java.util.Arrays;
import java.util.Comparator;

/**
 * Main class of the program that demonstrates working with the SportInventory class.
 */
public class Main {
    public static void main(String[] args) {
        // Array of SportInventory objects
        SportInventory[] inventory = {
                new SportInventory("Football", "Ball", 50.0, 0.45, 30),
                new SportInventory("Tennis Racket", "Racket", 120.0, 1.1, 10),
                new SportInventory("Basketball", "Ball", 60.0, 0.65, 20),
                new SportInventory("Golf Club", "Club", 200.0, 1.5, 5),
                new SportInventory("Ping Pong Paddle", "Racket", 30.0, 0.3, 40)
        };

        // Sorting: by weight in ascending order, and by price in descending order
        Arrays.sort(inventory, Comparator.comparingDouble(SportInventory::getWeight)
                .thenComparing(Comparator.comparingDouble(SportInventory::getPrice).reversed()));

        System.out.println("Sorted array:");
        for (SportInventory item : inventory) {
            System.out.println(item);
        }

        // Searching for an object identical to the given one
        SportInventory searchItem = new SportInventory("Basketball", "Ball", 60.0, 0.65, 20);
        int index = Arrays.binarySearch(inventory, searchItem, Comparator.comparing(SportInventory::getName));

        if (index >= 0) {
            System.out.println("\nFound object: " + inventory[index]);
        } else {
            System.out.println("\nObject not found.");
        }
    }
}