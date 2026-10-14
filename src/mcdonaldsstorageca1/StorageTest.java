package mcdonaldsstorageca1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author huend
 */
public class StorageTest {

    public static void main(String[] args) {

        // Creates a valid date for testing
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String validDate = LocalDate.now().plusDays(5).format(format);
        String invalidDate = LocalDate.now().plusDays(20).format(format);

        // Creates the first tray
        TrayArea tray = new TrayArea();

        // Creates the first menu item
        MenuItem item1 = new MenuItem("Burger", 250.0, validDate, "23:45");

        // Adds the item to the queue
        tray.addItem(item1);

        // Shows the first item
        tray.peekItem();

        // Shows the number of items
        tray.showSize();

        // Creates a second menu item
        MenuItem item2 = new MenuItem("Hotdog", 250.0, validDate, "21:30");

        // Adds the second item
        tray.addItem(item2);

        // Removes the first item (FIFO)
        tray.removeItem();

        // Checks the number of items
        tray.showSize();

        // Shows the next item
        tray.peekItem();

        // Removes the remaining item
        tray.removeItem();

        // Checks if the queue is empty
        tray.showSize();

        // Tries to view an item from an empty queue
        tray.peekItem();

        // Creates a new tray to test maximum capacity
        TrayArea fullTray = new TrayArea();

        // Creates an item for the capacity test
        MenuItem testItem = new MenuItem("Fries", 444.0, validDate, "12:00");

        // Adds 8 items to the tray
        for (int i = 0; i < 8; i++) {
            fullTray.addItem(testItem);
        }

        // Checks the queue size
        fullTray.showSize();

        // Tries to add a ninth item
        fullTray.addItem(testItem);

        // Checks if the queue still has 8 items
        fullTray.showSize();

        // Removes the first item
        fullTray.removeItem();

        // Checks the queue size after removing
        fullTray.showSize();

        // Adds a new item to the available position
        fullTray.addItem(testItem);

        // Checks if the queue has 8 items again
        fullTray.showSize();

        // Tests LIFO removal
        System.out.println("Testing LIFO removal:");

        fullTray.removeLastItem();
        fullTray.showSize();
        fullTray.peekItem();

        // Tests searching for food
        System.out.println("Testing search:");

        fullTray.searchItem("Fries");
        fullTray.searchItem("Pizza");

        // Tests FIFO and LIFO with different food items
        System.out.println("Testing FIFO and LIFO:");

        TrayArea orderTray = new TrayArea();

        MenuItem burger = new MenuItem("Burger", 250.0, validDate, "12:00");
        MenuItem pizza = new MenuItem("Pizza", 300.0, validDate, "12:05");
        MenuItem sandwich = new MenuItem("Sandwich", 200.0, validDate, "12:10");

        orderTray.addItem(burger);
        orderTray.addItem(pizza);
        orderTray.addItem(sandwich);

        // FIFO should remove Burger
        orderTray.removeItem();

        // LIFO should remove Sandwich
        orderTray.removeLastItem();

        // Pizza should be the remaining item
        orderTray.peekItem();
        orderTray.showSize();

        // Tests invalid weight
        try {
            MenuItem invalidItem = new MenuItem(
                    "Pizza", -50, validDate, "12:00"
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Validation: " + e.getMessage());
        }

        // Tests invalid best-before date
        try {
            MenuItem invalidItem = new MenuItem(
                    "Pizza", 250.0, invalidDate, "12:00"
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Validation: " + e.getMessage());
        }
    }
}



