/**
 * TernaryOperator
 */
public class TernaryOperator {

  public static void main(String[] args) {
    boolean x;
    x = (5>4) ? true : false;
    System.out.println(x);

    int y;
    y = (10 == 9) ? 1 : 0;
    System.out.println(y);

    String z = "";
    z = (z == " ") ? "true" : "false";
    System.out.println(z);
    
  }
}