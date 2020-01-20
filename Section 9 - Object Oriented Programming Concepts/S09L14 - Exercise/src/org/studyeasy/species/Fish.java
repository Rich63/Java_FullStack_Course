package org.studyeasy.species;

import org.studyeasy.parent.Animal;

/**
 * Fish
 */
public class Fish extends Animal {
  protected boolean waterBone = true;
  protected boolean gills = true;
  
  public Fish() {
    animalType = "Fish";
    this.waterBone = true;
    this.gills = true;
  }

  public String showInfo() {
    return "Fish [waterBone=" + waterBone + ", gills=" + gills + ", heightInMeter=" + heightInMeter + ", weightInKilos="
        + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
  }

}