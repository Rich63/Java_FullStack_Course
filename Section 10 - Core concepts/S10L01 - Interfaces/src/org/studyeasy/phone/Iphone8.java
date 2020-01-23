package org.studyeasy.phone;

public class Iphone8 implements Phone {

  @Override
  public String processor() {
    return "A11";
  }

  @Override
  public String OS() {
    return "IOS";
  }

  @Override
  public int spaceInGB() {
    return 64;
  }

  @Override
  public String toString() {
    return "Iphone8 [processor()=" + processor() + ", OS()=" + OS() + ", spaceInGB()=" + spaceInGB() + "]";
  }
}
