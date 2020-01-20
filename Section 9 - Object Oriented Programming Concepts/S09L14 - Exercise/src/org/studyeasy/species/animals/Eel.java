package org.studyeasy.species.animals;

import org.studyeasy.species.Fish;

/**
 * Eel
 */
public class Eel extends Fish {
  private String special;

  public Eel() {
    super();
    this.special = "Releases electric shock";
  }

  public String showInfo() {
    return "Eel [special=" + special + ", waterBone=" + waterBone + ", gills=" + gills + ", heightInMeter="
        + heightInMeter + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType
        + "]";
  }
  
}