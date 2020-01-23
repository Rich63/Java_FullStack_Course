package org.studyeasy.phone;

public class OnePlus5 implements Phone {

  // public int processor() {
  //   return 835;
  // }

//  public String processor() {
//    return "SD835";
//  }

  @Override
  public String processor() {
    return "SD835";
  }

  @Override
  public String OS() {
    return "Android";
  }

  @Override
  public int spaceInGB() {
    return 64;
  }

  @Override
  public String toString() {
    return "OnePlus5 [processor()=" + processor() + ", OS()=" + OS() + ", spaceInGB()=" + spaceInGB() + "]";
  }

}
