
public class Hello {

	public static void main(String[] args) {

		String first = "Hello", second = "World!";

		byte byteMinValue = -128;
		byte byteMaxValue = 127;
		short shortMinValue = -32767;
		short shortMaxValue = 32767;
		int intMinValue = -2147483647;
		int intMaxValue = 2147483647;
		long longMinValue = -9223372036854775808L;
		long longMaxValue = 9223372036854775807L;

		System.out.println(first + ' ' + second);
		System.out.println("The value for a byte must be between " + byteMinValue + " and " + byteMaxValue);
		System.out.println("The value for a short must be between " + shortMinValue + " and " + shortMaxValue);
		System.out.println("The value for an int must be between " + intMinValue + " and " + intMaxValue);
		System.out.println("The value for a long must be between " + longMinValue + " and " + longMaxValue);

	}

}
