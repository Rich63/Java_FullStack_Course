
public class Floating {

	public static void main(String[] args) {
		int intValue = 9;
		float floatValue = 9f;
		double doubleValue = 9d;
		
		int price = 512;
		double tax = 0.21f;
		
		System.out.println("intValue = " + intValue);
		System.out.println("floatValue = " + floatValue);
		System.out.println("doubleValue = " + doubleValue);
		
		System.out.println("price excl. tax = " + price + " price incl. tax = " + (price + (price * tax)));

	}

}
