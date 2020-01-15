/**
 * MakingDecisionWithIfElse
 */
public class MakingDecisionWithIfElse {

  public static void main(String[] args) {
    int x = 5;

    if(x == 10) ; // because the semicolon here the output will always be Condition is true
      System.out.println("Condition is true");

    if (x == 5) { // this { } is a code block so all what is in the codeblock will be executed if condition is true
      System.out.println("Condition is true");
      System.out.println("Condition is true");
    }

    // x -= 5;
    if (x == 5) {
      System.out.println("X equals 5");
    } else if (x > 5) {
      System.out.println("X is greater then 5");
    } else {
      System.out.println("X is smaller then 5");
    }
  }
}