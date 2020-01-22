package org.studyeasy.species.animals;

import org.studyeasy.species.Bird;

/**
 * Eagle
 */
public class Eagle extends Bird {

  public String showInfo() {
    return "Eagle [hasFeathers=" + hasFeathers + ", canFly=" + canFly + ", heightInMeter=" + heightInMeter
        + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
  }

}