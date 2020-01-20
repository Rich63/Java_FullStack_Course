package org.studyeasy;

import org.studyeasy.parent.Animal;
import org.studyeasy.species.Fish;
import org.studyeasy.species.Reptile;
import org.studyeasy.species.animals.Crocodile;
import org.studyeasy.species.animals.Eagle;
import org.studyeasy.species.animals.Eel;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    // Animal animal = new Animal();
    // System.out.println(animal.showInfo());

    // Reptile reptile = new Reptile();
    // System.out.println(reptile.showInfo());
    
    // Crocodile crocodile = new Crocodile();
    // System.out.println(crocodile.showInfo());
    
    // Fish fish = new Fish();
    // System.out.println(fish.showInfo());
    
    // Eel eel = new Eel();
    // System.out.println(eel.showInfo());
    
    Eagle eagle = new Eagle();
    System.out.println(eagle.showInfo());
  }
}