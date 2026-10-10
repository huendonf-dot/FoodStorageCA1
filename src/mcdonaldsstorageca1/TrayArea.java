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

// Adds a new item to the queue
public void addItem(MenuItem item) {
    // Checks if the queue is full
   if (rear == 8) {
    System.out.println("Tray area is full.");
    return;
}
items[rear] = item;
rear++;
}
// Removes the first item from the queue
public void removeItem() {
    // Checks if the queue is empty
if (front == rear) {
    System.out.println("Tray area is empty.");
    return;
}
items[front] = null;
front++;
}
// Shows the first item in the queue
public void peekItem() {
    // Checks if the queue is empty
if (front == rear) {
    System.out.println("Tray area is empty.");
    return;
}
System.out.println("Next item: " + items[front].getName());
}
// Shows how many items are in the queue
public void showSize() {
int size = rear - front;
System.out.println("Items in tray area: " + size);
}
}