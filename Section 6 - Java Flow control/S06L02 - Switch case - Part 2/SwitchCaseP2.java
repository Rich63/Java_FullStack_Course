/**
 * SwitchCaseP2
 */
public class SwitchCaseP2 {
  public static void main(String[] args) {
    char x = 'B';

    switch(x) {
      case 'a': 
      case 'A': 
        System.out.println("x is a");
        break;
      case 'b':
      case 'B':
        System.out.println("x is b");
        break;
      case 'c':
      case 'C':
        System.out.println("x is c");
        break;
      default:
        System.out.println("x is not a, b or c");
        break;
    }

  }

}