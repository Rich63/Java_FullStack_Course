package org.studyeasy;

/**
 * S09L18
 */
public class S09L18_19 {

  public static void main(String[] args) {
//    Because there is no default Constructor in Person.java, the object Person has to be initialized.
//    Person person = new Person(); 
//    System.out.println(person);
//  the object Person has to be initialized.
    Person rich = new Person("Richard", 25, "male");
    System.out.println(rich);
    rich.setAge(-57);   // This will not be accepted
    System.out.println(rich);
    rich.setAge(57);
    System.out.println(rich);
  }
}