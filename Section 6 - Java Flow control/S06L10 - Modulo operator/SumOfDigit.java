/**
 * SumOfDigit
 */
public class SumOfDigit {

  public static void main(String[] args) {
    
    int value = 123456789;
    int startValue = value;
    int sumOfDigits = 0;

    while(true) {
      sumOfDigits = sumOfDigits + value%10;
      value = value / 10;
      System.out.println(value+" "+sumOfDigits);
      if(value<10) {
        sumOfDigits = sumOfDigits + value;
        break;
      }
    }
    System.out.println("Sum of the digits from "+startValue+" is: "+sumOfDigits);
  }
}