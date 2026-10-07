/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcdonaldsstorageca1;

/**
 *
 * @author huend
 */
public class MenuItem {
 private String name;
private double weight;
private String bestBeforeDate;
private String timeAdded; 

public MenuItem(String name, double weight, String bestBeforeDate, String timeAdded) {
 this.name = name;
this.weight = weight;
this.bestBeforeDate = bestBeforeDate;
this.timeAdded = timeAdded;   
}
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
