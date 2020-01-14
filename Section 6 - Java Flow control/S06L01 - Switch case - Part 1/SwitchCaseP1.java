/**
 * SwitchCaseP1
 */
public class SwitchCaseP1 {
  public static void main(String[] args) {
    int x = 0;

    // if(x == 1) {
    //   System.out.println("x is 1");
    // } else if(x == 2) {
    //   System.out.println("x is 2");
    // } else if(x == 3) {
    //   System.out.println("x is 3");
    // } else {
    //   System.out.println("x is not 1, 2 or 3");
    // }

    switch(x) {
      case 1: 
        System.out.println("x is 1");
        break;
      case 2:
        System.out.println("x is 2");
        break;
      case 3:
        System.out.println("x is 3");
        break;
      default:
        System.out.println("x is not 1, 2 or 3");
        break;
    }






  }

}