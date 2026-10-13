/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mcdonaldsstorageca1;

/**
 *
 * @author huend
 */
public class StorageTest {
public static void main(String[] args) {
TrayArea tray = new TrayArea();

// Creates the first menu item
MenuItem item1 = new MenuItem("Big Mac", 0.25, "20/10/2026", "23:45");

// Adds the item to the queue
tray.addItem(item1);
// Shows the first item
tray.peekItem();
// Shows the number of items in the queue
tray.showSize(); 

// Creates a second menu item
MenuItem item2 = new MenuItem("HotDog", 0.25, "18/10/2026", "21:30");

// Adds the second item to the queue
tray.addItem(item2);
// Removes the first item from the queue
tray.removeItem();

// Checks the number of items after removing
tray.showSize();
// Shows the next item after removing the first
tray.peekItem();
// Removes the remaining item
tray.removeItem();

// Checks if the queue is empty
tray.showSize();

// Tries to view an item from an empty queue
tray.peekItem();
// Creates a new tray to test the maximum capacity
TrayArea fullTray = new TrayArea();
// Creates an item for the capacity test
MenuItem testItem = new MenuItem("Fries", 444.0, "15/10/2026", "12:00");

// Adds the first item
fullTray.addItem(testItem);
// Checks the number of items
fullTray.showSize();
// Adds 7 more items to test the queue capacity
for (int i = 0; i < 7; i++) {
    fullTray.addItem(testItem);
}

// Checks the queue size after adding 8 items
fullTray.showSize();
// Tries to add an item when the queue is full
fullTray.showSize();
// Removes one item from the full queue
fullTray.removeItem();

// Checks the queue size after removing
fullTray.showSize();
// Adds a new item to the available position
fullTray.addItem(testItem);

// Checks if the queue has 8 items again
fullTray.addItem(testItem);

// Checks if the queue still has 8 items
fullTray.showSize();
// Tests LIFO removal
System.out.println("Testing LIFO removal:");

fullTray.removeLastItem();
fullTray.showSize();
fullTray.peekItem();
// Tests invalid weight
try {
    MenuItem invalidItem = new MenuItem("Pizza", -50, "14/10/2026", "12:00");
} catch (IllegalArgumentException e) {
    System.out.println("Validation: " + e.getMessage());
}
// Tests invalid best-before date
try {
    MenuItem invalidDate = new MenuItem(
        "Pizza", 250.0, "30/11/2026", "12:00"
    );
} catch (IllegalArgumentException e) {
    System.out.println("Validation: " + e.getMessage());
}
}

}


