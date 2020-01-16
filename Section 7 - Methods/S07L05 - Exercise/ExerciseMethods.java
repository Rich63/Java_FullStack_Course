import Calculate;
/**
 * ExerciseMethods
 */
public class ExerciseMethods {

  public static void main(String[] args) {
    Calculate prime = new Calculate();

    if(prime.isPrime(7.3f)) {
      System.out.println("Number passed is a Prime Number");
    } else {
      System.out.println("Number passed is NOT a Prime Number");
    }
  }
}