/**
 * ForLoop
 */
public class ForLoop {
  public static void main(String[] args) {
    // We need a output from 1 to 10 each on a new line. We can do:
    // System.out.println(1);
    // System.out.println(2);
    // System.out.println(3);
    // System.out.println(4);
    // System.out.println(5);
    // System.out.println("6\n7\n8\n9\n10"); // \n is special character for a new line

    // for(int i=1;i<=10;i++) {
    //   System.out.println("Value is " + i);
    // }

    // int isPrime = 25;

    for(int i = 1; i <= 100; i++) {
      if ((i % 2) == 1) {
        System.out.println(i + " is not a prime number");
      } else System.out.println(i + " is a prime number");
    }

  }

}