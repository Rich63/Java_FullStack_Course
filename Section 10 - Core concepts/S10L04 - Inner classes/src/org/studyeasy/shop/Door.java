package org.studyeasy.shop;

public class Door {
  private Lock lock;   // Object of Lock class

  public Door() {
    lock = new Lock(true);
  }
  
  public Lock getLock() {
    return lock;
  }

  public void setLock(Lock lock) {
    this.lock = lock;
  }

  public void shopStatus() {
    if(lock.isLock()) {
      System.out.println("Shop is closed, please visit later.");
    } else {
      System.out.println("Welcome, we are open.");
    }
  }
  
  public class Lock {  // Inner class
    private boolean lock;   // Local variable in Lock class

    public Lock(boolean lock) {
      
      this.lock = lock;
    }

    public boolean isLock() {
      return lock;
    }

    public void setLock(boolean lock) {
      this.lock = lock;
    }
    
  }
}
