/**
 * Methods
 */
public class Methods {

  public static void main(String[] args) {
    loop(1,5);
    loop(1,4);
    loop(1,3);
  }

  public static void loop(int step, int finalValue) {
    while(step<=finalValue) {
      System.out.println(step);
      step++;
    }
    System.out.println("**********");
  }
  
  public static void loop1() {
    int i=1;
    while(i<=5) {
      System.out.println(i);
      i++;
    }
  }

  public static void loop2() {
    int i=1;
    while(i<=5) {
      System.out.println(i);
      i++;
    }
  }
}