package org.studyeasy;

import org.studyeasy.shop.Door;

public class Shop {
    public static void main(String[] args) throws Exception {
      // Door door = new Door();
      if(new Door().isLocked("test")) {  // Anonymous object, use qwerty as key or something else
        System.out.println("Shop has closed, visit later.");
      } else {
        System.out.println("Welcome, we are open");
      }
    }
}