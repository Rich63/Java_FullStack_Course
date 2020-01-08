import java.math.BigDecimal;

public class BigDecimalPart {

	public static void main(String[] args) {
		double x = 1.05, y = 2.55;
		BigDecimal bd1 = new BigDecimal(1.05), bd2 = new BigDecimal(2.55); 
		BigDecimal bd3 = new BigDecimal("1.05"), bd4 = new BigDecimal("2.55"); 

		System.out.println(x+y);			//problem this will not return 3.60
		System.out.println(bd1.add(bd2));	//problem this will not return 3.60
		System.out.println(bd3.add(bd4));	//problem solved
	}

}
