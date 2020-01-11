/**
 * ArithmeticOperators
 */
public class ArithmeticOperators {

  public static void main(String[] args) {
    // integer variable “A” holds value 5 and variable “B” holds value 10.
    int a = 5;
    int b = 10;

    // Add two operands
    int c = a + b;
    System.out.println("a(5) + b(10) = " + c); // a(5) + b(10) = 15

    // Subtract the second operand from first
    int d = b - a;
    System.out.println("b(10) - a(5) = " + d); // b(10) - a(5) = 5

    // Multiply both operands
    int e = a * b;
    System.out.println("a(5) * b(10) = " + e); // a(5) * b(10) = 50

    // Divide numerator by de-numerator
    int f = b / a;
    System.out.println("b(10) / a(5) = " + f); // b(10) / a(5) = 2

    // Modulus operator gives a reminder after an integer division
    int g = b % a;
    System.out.println("b(10) % a(5) = " + g); // b(10) % a(5) = 0

    // Increment operator increases integer value by  one
    int h = ++a;
    System.out.println("++a(5) = " + h); // a(5) = 6

    // Decrement operator decreases integer value by one
    int i = --a;
    System.out.println("--a(6) = " + i); // a(6) = 5

  }
}