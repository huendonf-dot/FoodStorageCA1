/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcdonaldsstorageca1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author huend
 */
// Stores the information about one menu item
public class MenuItem extends FoodItem {
    // Item details
private String bestBeforeDate;
private String timeAdded; 
// Creates a new menu item
public MenuItem(String name, double weight, String bestBeforeDate, String timeAdded) {
    if (weight <= 0) {
    throw new IllegalArgumentException("Weight must be greater than zero.");
}
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate expiryDate = LocalDate.parse(bestBeforeDate, format);
LocalDate today = LocalDate.now();

long days = ChronoUnit.DAYS.between(today, expiryDate);

if (days < 0 || days > 14) {
    throw new IllegalArgumentException("Best-before date must be within 14 days.");
}
 this.name = name;
this.weight = weight;
this.bestBeforeDate = bestBeforeDate;
this.timeAdded = timeAdded;   
}
// Get item information
public String getName() {
    
    return name;
}
public double getWeight() {
    return weight;
}

public String getBestBeforeDate() {
    return bestBeforeDate;
}

public String getTimeAdded() {
    return timeAdded;
}
}
