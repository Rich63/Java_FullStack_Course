package org.studyeasy.species;

import org.studyeasy.parent.Animal;

/**
 * Bird
 */
public class Bird extends Animal {
  protected boolean hasFeathers = true;
  protected boolean canFly = true;
  
  public Bird() {
    super();
    this.hasFeathers = true;
    this.canFly = true;
  }

  public String showInfo() {
    return "Bird [hasFeathers=" + hasFeathers + ", canFly=" + canFly + ", heightInMeter=" + heightInMeter
        + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
  }
  
}