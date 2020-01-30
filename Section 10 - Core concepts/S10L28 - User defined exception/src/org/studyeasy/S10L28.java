package org.studyeasy;

import java.io.FileNotFoundException;

public class S10L28 {
  public static void main(String[] args) {
    try {
      someMethod();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      System.out.println("Message from main method, FileNotFoundException!");
    } catch(UserDefinedException e) {
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("Message from main method, Exception!");
    }
  }

  public static void someMethod() throws FileNotFoundException, Exception, UserDefinedException {
    int x = 3;
    switch(x) {
      case 1:
        throw new FileNotFoundException();
      case 2:
        throw new Exception();
      default:
        throw new UserDefinedException();
    }
  }
}