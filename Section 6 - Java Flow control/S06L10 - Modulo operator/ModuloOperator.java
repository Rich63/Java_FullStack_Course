/**
 * ModuloOperator
 */
public class ModuloOperator {

  public static void main(String[] args) {

    int x=10/3;
    int y=10%3;
    System.out.println("int value of calculation 10 / 3 = "+x+"\nint value of calculation 10 % 3 = "+y);

    int z = 13;
    if(z%2 == 0) {
      System.out.println("Value is even");
    } else {
      System.out.println("Value is odd");
    }
    
  }
}