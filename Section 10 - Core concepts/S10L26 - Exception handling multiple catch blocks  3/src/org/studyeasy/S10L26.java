package org.studyeasy;

public class S10L26 {
  public static void main(String[] args) {
    int x = 10;
    try {
      System.out.println("We don't know what will be printed "+x/0);
    } catch(ArithmeticException e) {
      System.out.println("ArithmeticException");
    } catch(RuntimeException e) {
      System.out.println("RuntimeException");
    } catch(Exception e) {
      System.out.println("Exception");
    } finally {
      System.out.println("This will always get printed!!!");
    }
  }
}