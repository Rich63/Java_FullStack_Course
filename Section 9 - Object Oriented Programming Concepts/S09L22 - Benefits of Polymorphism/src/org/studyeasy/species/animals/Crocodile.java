package org.studyeasy.species.animals;

import org.studyeasy.species.Reptile;

/**
 * Crocodile
 */
public class Crocodile extends Reptile {
  String eggs;

  public Crocodile() {
    super();
    eggs = "Hard-shelled";
  }

  public String showInfo() {
    return "Crocodile [eggs=" + eggs + ", skin=" + skin + ", backbone=" + backbone + ", heightInMeter=" + heightInMeter + 
      ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
  }

}