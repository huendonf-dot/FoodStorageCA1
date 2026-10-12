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
// Removes the first item from the queue
tray.removeItem();

// Checks the number of items after removing
tray.showSize();
}
}

