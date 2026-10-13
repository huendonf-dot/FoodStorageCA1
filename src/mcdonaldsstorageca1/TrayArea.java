/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mcdonaldsstorageca1;

/**
 *
 * @author huend
 */// Controls the food trays using a queue
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
// Removes the first item from the queue
public void removeItem() {
    // Checks if the queue is empty
if (count == 0) {
    System.out.println("Tray area is empty.");
    return;
}
}
// Removes the last item (LIFO)
public void removeLastItem() {

    if (count == 0) {
        System.out.println("Tray area is empty.");
        return;
    }

    rear = (rear - 1 + 8) % 8;
    items[rear] = null;
    count--;
}
// Shows the first item in the queue
public void peekItem() {
    // Shows the number of items in the queue
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
}