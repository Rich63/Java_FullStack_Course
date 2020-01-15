/**
 * Exercise
 */
public class Exercise {

  public static void main(String[] args) {
    // My own solution
    // String str = "@";
    // for(int x=1;x<=5;x++) {
    //   System.out.println(str);
    //   str = str + "@";
    // }
    // for(int x=5;x<=10;x--) {
    //   str = str.substring(1, x);
    //   if(str.length()==0) break;
    //   System.out.println(str);
    // }

    // Solution in the course
    for(int i=1;i<=5;i++) {
      for(int j=1;j<=i;j++) {
        System.out.print("@");
      }
      System.out.println();
    }
  }
}