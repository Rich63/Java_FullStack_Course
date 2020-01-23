package org.studyeasy.phone;

public interface Phone {

  // An interface places restrictions on fields and methods, so the class that implements
  // Has to implement all fields and methods
  public String processor();
  public String OS();
  public int spaceInGB();
  
}
