package org.studyeasy;

/**
 * Person
 */
public class Person {
  private String name = "unknown";
  private int age = 999;
  private String gender = "unknown";
  
//  public Person() {
//    this.name = "unknown";
//    this.age = 999;
//    this.gender = "unknown";
//  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  public boolean setAge(int age) {
    if(age>=0 && age<=100) {
      this.age = age;
      return true;
    } else {
      return false;
    }
  }

  public String getGender() {
    return gender;
  }
  
  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
  }
  
}