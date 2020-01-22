package org.studyeasy;

import org.studyeasy.vehicles.Bike;
import org.studyeasy.vehicles.Car;
import org.studyeasy.vehicles.Truck;

public class App {
  public static void main(String[] args) throws Exception {
    // Making use of the default Constructor
    // Bike bike = new Bike();

    // System.out.println(bike.getHandle());
    // System.out.println(bike.getEngine());

    // Making use of the super() fields and class field from the Constructor
    // Bike bike = new Bike("Long", "Diesel",4,5,40,"LED");

    // System.out.println("Handle: "+bike.getHandle());
    // System.out.println("Engine Type: "+bike.getEngine());
    // System.out.println("Number of seats: "+bike.getSeats());
    // System.out.println("Fuel tank capacity: "+bike.getFuelTank());
    // System.out.println("Head lamp type: "+bike.getLights());
    // System.out.println("Number of wheels: "+bike.getWheels());

    Bike bike = new Bike("Long", "Diesel",4,5,40,"LED");
    // System.out.println(bike);
    // this will normally output org.studyeasy.vehicles.Bike@15db9742 but because of the toString()
    // @Override in Bike.java the output will look as is defined in the @Override
    bike.run();
    // this will normally output "Running Vehicle" but because of the toString()
    // @Override in Bike.java the output will look as is defined in the @Override "Running Bike" + the sysout(toString()) in the run method

    Car car = new Car("Steering","Music System","airConditioner","Fridge","Entertainment System","Diesel",4,5,40,"LED");
    System.out.println(car);

    Truck truck = new Truck("Steering","Music System","airConditioner",2,"Diesel",16,3,240,"Halogen");
    System.out.println(truck);

  }
}