package org.studyeasy;

import org.studyeasy.laptop.Laptop;
import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;

public class S09L15 {

  public static void main(String[] args) {
    // Laptop lap = new Laptop();
    // System.out.println("Processor brand: "+lap.getProcessor().getBrand());
    // System.out.println("Graphics card brand: "+lap.getGraphicsCard().getBrand());

    Processor processor = new Processor("AMD", "Ryzen 5 2400G", 5, 6, 12, "4MB", "3.6Ghz", "3.6Ghz", "3.9Ghz");
    GraphicsCard graphicsCard = new GraphicsCard("Radeon", 11, "Shared");

    Laptop gamingLaptop = new Laptop(17, processor, "DDR4 16GB", "SSD 500GB", "SATA 2TB", graphicsCard, "No", "Gaming backlit");
    System.out.println(gamingLaptop);
    System.out.println(gamingLaptop.gamingMode());
    System.out.println("Current frequency: "+gamingLaptop.getProcessor().getFrequency());
  }

}
