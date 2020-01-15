public class PrimenumberToCheckCheck {

  public static void main(String[] args) {
    int remainder;
    boolean isPrime = true;
    int numberToCheck = 25; // Enter the number you want to check for prime

    // Loop to check whether the numberToCheck is divisible any numberToCheck other
    // than 1 and itself
    for (int i = 2; i <= numberToCheck / 2; i++) {
      // numberToCheck is dived by itself
      remainder = numberToCheck % i;
      System.out.println(numberToCheck + " Divided by " + i + " gives a remainder " + remainder);

      // if remainder is 0 than numberToCheck is not prime and break loop. Else
      // continue loop
      if (remainder == 0) {
        isPrime = false;
        break;
      }
    }
    // Check value true or false, if isPrime is true then numberToCheck is prime
    // otherwise not prime
    if (isPrime)
      System.out.println(numberToCheck + " is a Prime numberToCheck");
    else
      System.out.println(numberToCheck + " is not a Prime numberToCheck");
  }
}