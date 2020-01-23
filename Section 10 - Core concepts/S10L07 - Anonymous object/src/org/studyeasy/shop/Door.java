package org.studyeasy.shop;

public class Door {

  public boolean isLocked(String key) {
    
    class Lock {    // This is an (abstract) local inner class
      public boolean isLocked(String key) {
        if(key.equals("qwerty")) {
          return false;
        } else {
          return true;
        }
      }
    }
    
    return new Lock().isLocked(key);
  }
}
