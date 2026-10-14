/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mcdonaldsstorageca1;

/**
 *
 * @author huend
 */ 
 
 /// Controls the food trays using a queue
public class TrayArea {
    // Queue with maximum 8 items
    private MenuItem[] items = new MenuItem[8];
private int front = 0;
private int rear = 0;
// Counts the number of items in the queue
private int count = 0;

// Adds a new item to the queue
public void addItem(MenuItem item) {
    // Checks if the queue is full
   if (count == 8) {
    System.out.println("Tray area is full.");
    return;
}
items[rear] = item;
rear = (rear + 1) % 8;
count++;
}
// Removes the first food item (FIFO)
public void removeItem() {

    // Checks if the tray is empty
    if (count == 0) {
        System.out.println("Tray area is empty.");
        return;
    }

    // Removes the first item
    System.out.println("Removed: " + items[front].getName());

    items[front] = null;

    // Moves to the next position
    front = (front + 1) % 8;

    // Reduces the number of items
    count--;
}
// Removes the last food item (LIFO)
public void removeLastItem() {

    // Checks if the tray is empty
    if (count == 0) {
        System.out.println("Tray area is empty.");
        return;
    }

    // Moves back to the last item
    rear = (rear - 1 + 8) % 8;

    // Shows the removed food
    System.out.println("Removed: " + items[rear].getName());

    // Removes the last item
    items[rear] = null;

    // Reduces the number of items
    count--;
}
// Shows the first item in the queue
public void peekItem() {
    
    // Checks if the queue is empty
if (count == 0) {
    System.out.println("Tray area is empty.");
    return;
}
System.out.println("Next item: " + items[front].getName());
}
// Shows how many items are in the queue
public void showSize() {
System.out.println("Items in tray area: " + count);
}
// Displays all food items
public void displayItems() {
    if (count == 0) {
        System.out.println("Tray area is empty.");
        return;
    }

    for (int i = 0; i < count; i++) {
        int position = (front + i) % 8;
        System.out.println(items[position].getName());
    }
}
// Searches for a food item by name
public void searchItem(String name) {

    // Checks if the storage is empty
    if (count == 0) {
        System.out.println("Tray area is empty.");
        return;
    }

    // Searches through the stored food items
    for (int i = 0; i < count; i++) {
        int position = (front + i) % 8;

        if (items[position].getName().equalsIgnoreCase(name)) {
            System.out.println("Food found: " + items[position].getName());
            return;
        }
    }

    // Shows a message if the food is not found
    System.out.println("Food not found.");
}
}