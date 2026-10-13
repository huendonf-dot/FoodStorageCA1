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
MenuItem item1 = new MenuItem("Big Mac", 0.25, "10/10/2026", "23:45");

// Adds the item to the queue
tray.addItem(item1);
// Shows the first item
tray.peekItem();
// Shows the number of items in the queue
tray.showSize(); 

// Creates a second menu item
MenuItem item2 = new MenuItem("McChicken", 0.25, "12/10/2026", "21:30");

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
}
}

