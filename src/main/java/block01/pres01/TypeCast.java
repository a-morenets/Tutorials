package block01.pres01;

public class TypeCast {

	public static void main(String[] args) {
		/*
		 * Q: What will this code output?
		 * A: 147 (49 + 49 + 49)
		 */
		char c2 = '\u0031';
		char c1 = '1'; // '\u0031';
		char c3 = 49; // '\u0031';
		System.out.println(c1 + c2 + c3);

		/*
		 * Q: What will this code output?
		 * A: 111 (symbol '1' 3 times)
		 */
		c2 = '\u0031';
		c1 = '1'; // '\u0031';
		c3 = 49; // '\u0031';
		System.out.println("" + c1 + c2 + c3);
		
		// Q: Is there difference?
//		int v1 = 1; long v2 = 2; v1 = v1 + v2; // A: Cannot convert from long (v1 + v2) to int (v1)
		int v1 = 1; long v2 = 2; v1 += v2; // correct
		System.out.println(v1);

		// Q: what will be the result?
		byte b = 1;
//		byte c = b + 1; // A: cannot convert int (b + 1) to byte (c)
		
		// Q: what will be the result?
		int x = 1;
		System.out.println("x = " + x); // "x = 1"
		System.out.println(1 + 2 + "text"); // "3text"
		System.out.println("text" + 1 + 2); // "text12"
	}

}
