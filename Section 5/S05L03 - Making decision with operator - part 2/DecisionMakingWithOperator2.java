/**
 * DecisionMakingWithOperator
 */
public class DecisionMakingWithOperator2 {

  public static void main(String[] args) {
    int x=6, y=5;

    if (x < y) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    if (x < y) {
      System.out.println("x is less then y");
    } else if (x > y) {
        System.out.println("x is greater then y");
    } else {
        System.out.println("x is equal to y");
    }

  }
}