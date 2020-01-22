package org.studyeasy.species;

import org.studyeasy.parent.Animal;

/**
 * Reptile
 */
public class Reptile extends Animal {

  protected String skin, eggs;
  protected boolean backbone;
  
  public Reptile() {
    heightInMeter = 1.524;
    weightInKilos = 20;
    animalType = "Reptile";
    bloodType = "Cold";
    this.skin = "Dry Skin";
    this.backbone = true;
    this.eggs = "Soft shelled";
  }

  public Reptile(String skin, boolean backbone, String eggs, double height, double weight, String animalType, String bloodType) {
    super(height, weight, animalType, bloodType);
    this.skin = skin;
    this.backbone = backbone;
    this.eggs = eggs;
  }

  public String getSkin() {
    return skin;
  }

  public boolean hasBackbone() {
    return backbone;
  }

  public String getEggs() {
    return eggs;
  }

  public String showInfo() {
    return "Reptile [getSkin()=" + getSkin() + ", hasBackbone()=" + hasBackbone() + ", getEggs()=" + getEggs()
        + ", getHeight()=" + getHeightInMeter() + ", getWeight()=" + getWeightInKilos() + ", getAnimalType()=" + getAnimalType()
        + ", getBloodType()=" + getBloodType() + "]";
  }
  
}