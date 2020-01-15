/**
 * BreakAndContinue
 */
public class BreakAndContinue {

  public static void main(String[] args) {
    for(int i=1;i<10;i++) {
      // System.out.println(i);
      // if(i == 5) {
      //   break;
      // }
      if(i == 6) {
        continue;
      }
      System.out.println(i); // in the output 6 is not there
    }
  }
}