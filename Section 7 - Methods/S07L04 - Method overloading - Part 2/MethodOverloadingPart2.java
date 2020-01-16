/**
 * MethodOverloadingPart2
 */
public class MethodOverloadingPart2 {

  public static void main(String[] args) {

    System.out.println("Sum 1+2= "+sum(1, 2));
    System.out.println("Sum 1+2.5= "+sum(1, 2.5f));
    System.out.println("Sum 1.3+2.3= "+sum(1.3, 2.3));
    System.out.println("Sum 1+2+3= "+sum(1, 2, 3));
    System.out.println("Sum 1+2+3+4+5+6= "+sum(1, 2, 3, 4, 5, 6));
  }

  public static int sum(int x, int y) {
    System.out.println("Adding 2 int entities");
    return x + y;
  }

  public static float sum(int x, float y) {
    System.out.println("Adding 1 int and 1 float entity");
    return x + y;
  }

  public static double sum(double x, double y) {
    System.out.println("Adding 2 double entities");
    return x + y;
  }

  public static int sum(int x, int y, int z) {
    System.out.println("Adding 3 int entities");
    return x + y + z;
  }

  public static int sum(int x, int y, int z, int a, int b, int c) {
    System.out.println("Adding 6 int entities");
    return x + y + z + a + b + c;
  }

}