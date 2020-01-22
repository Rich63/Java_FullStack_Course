package org.studyeasy.parent;

/**
 * Animal
 */
public class Animal {

  protected double heightInMeter;
  protected double weightInKilos;
  protected String animalType;
  protected String bloodType;

  public Animal() {
    this.heightInMeter = 0;
    this.weightInKilos = 0;
    this.animalType = "unknown";
    this.bloodType = "unknown";
  }

  public Animal(double heightInMeter, double weightInKilos, String animalType, String bloodType) {
    this.heightInMeter = heightInMeter;
    this.weightInKilos = weightInKilos;
    this.animalType = animalType;
    this.bloodType = bloodType;
  }

  public double getHeightInMeter() {
    return heightInMeter;
  }

  public double getWeightInKilos() {
    return weightInKilos;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getBloodType() {
    return bloodType;
  }

  public String showInfo() {
    return "Animal [ heightInMeter=" + heightInMeter + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
  }
  
}