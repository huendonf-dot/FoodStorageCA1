/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mcdonaldsstorageca1;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author huend
 */
public class StorageMenu {

    public static void main(String[] args) {

        // Start the food storage
        Scanner input = new Scanner(System.in);
        TrayArea tray = new TrayArea();

        int option = 0;

        // Keep showing the menu until the user exits
        while (option != 7) {

            System.out.println("\n===== FOOD STORAGE SYSTEM =====");
            System.out.println("1. Add food item");
            System.out.println("2. Remove first item (FIFO)");
            System.out.println("3. Remove last item (LIFO)");
            System.out.println("4. Peek item");
            System.out.println("5. Display food items");
            System.out.println("6. Search food item");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");

            // Check if the user entered a number
            if (!input.hasNextInt()) {
                System.out.println("Please enter a number.");
                input.nextLine();
                continue;
            }

            option = input.nextInt();
            input.nextLine();

            switch (option) {

                case 1:
                    // Ask for the food details
                    System.out.print("Enter food name: ");
                    String name = input.nextLine().trim();

                    // Only accept the five food types
                    if (!name.equalsIgnoreCase("Burger")
                            && !name.equalsIgnoreCase("Pizza")
                            && !name.equalsIgnoreCase("Fries")
                            && !name.equalsIgnoreCase("Sandwich")
                            && !name.equalsIgnoreCase("Hotdog")) {

                        System.out.println("Invalid food name.");
                        break;
                    }

                    System.out.print("Enter weight in grams: ");

                    // Check if the weight is a number
                    if (!input.hasNextDouble()) {
                        System.out.println("Invalid weight.");
                        input.nextLine();
                        break;
                    }

                    double weight = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter best-before date (dd/MM/yyyy): ");
                    String date = input.nextLine();

                    // Save the current time
                    String time = LocalTime.now().toString();

                    try {
                        // Create and add the food item
                        MenuItem item = new MenuItem(name, weight, date, time);
                        tray.addItem(item);

                } catch (java.time.format.DateTimeParseException e) {
    // Invalid date entered
    System.out.println("Invalid date format.");

} catch (IllegalArgumentException e) {
    // Invalid weight or expiry date
    System.out.println("Validation: " + e.getMessage());
}
                    break;

                case 2:
                    // Remove the first food (FIFO)
                    tray.removeItem();
                    break;

                case 3:
                    // Remove the last food (LIFO)
                    tray.removeLastItem();
                    break;

                case 4:
                    // Show the next food
                    tray.peekItem();
                    break;

                case 5:
                    // Show all food itemsstorage
                    tray.displayItems();
                    break;

                case 6:
                    // Search for a food by name
                    System.out.print("Enter food name to search: ");
                    String searchName = input.nextLine().trim();

                    tray.searchItem(searchName);
                    break;

                case 7:
                    // Close the program
                    System.out.println("Closing application.");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

        input.close();
    }
}
