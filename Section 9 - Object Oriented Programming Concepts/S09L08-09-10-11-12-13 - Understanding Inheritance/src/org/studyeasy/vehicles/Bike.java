package org.studyeasy.vehicles;

import org.studyeasy.parent.Vehicle;

/**
 * Bike
 */
public class Bike extends Vehicle {

  private String handle;

  
  public Bike() {
    super();
    this.handle = "Short";
  }

  public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
    super(engine, wheels, seats, fuelTank, lights);
    this.handle = handle;
  }

  public String getHandle() {
    return handle;
  }

  @Override
  public String toString() {
    return "Bike handle: " + getHandle() + 
            "\n Engine Type: " + getEngine() + 
            "\n Number of wheels: " + getWheels() + 
            "\n Number of seats: " + getSeats() + 
            "\n Fuel tank capacity: " + getFuelTank() + 
            "\n Head lamp type: " + getLights();
  }
  
  public void run() {
    System.out.println("Running Bike");
    System.out.println(toString());
  }
 
}