package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

import org.studyeasy.parent.Animal;
import org.studyeasy.species.Fish;
import org.studyeasy.species.Reptile;
import org.studyeasy.species.animals.Crocodile;
import org.studyeasy.species.animals.Eagle;
import org.studyeasy.species.animals.Eel;

/**
 * App This is from Section 9 Lesson 14 S09L14
 */
public class App {
  
    public static void main(String[] args) {
      List<Animal> animals = new ArrayList<>();
      
      Animal animal = new Animal();
  //    System.out.println(animal.showInfo());
  
      // Reptile reptile = new Reptile();
      Animal reptile = new Reptile();
  //    System.out.println(reptile.showInfo());
      
      // Crocodile crocodile = new Crocodile();
      Animal crocodile = new Crocodile();
  //    System.out.println(crocodile.showInfo());
      
      // Fish fish = new Fish();
      Animal fish = new Fish();
  //    System.out.println(fish.showInfo());
      
      // Eel eel = new Eel();
      Animal eel = new Eel();
  //    System.out.println(eel.showInfo());
      
      // Eagle eagle = new Eagle();
      Animal eagle = new Eagle();
  //    System.out.println(eagle.showInfo());
      
      animals.add(animal);
      animals.add(reptile);
      animals.add(crocodile);
      animals.add(fish);
      animals.add(eel);
      animals.add(eagle);
      
      listOfAnimals(animals);
  }
    
    public static void listOfAnimals(List<Animal> animals) {
      for(Animal animal: animals) {
        System.out.println(animal.showInfo());
      }
    }
}