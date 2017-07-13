package block01;

public class Lect02 {
	
	public static void main(String[] args) {
		
		// CR LF
		
		String s1 = "String1\r"; // CR LF
		String s2 = "String2\n"; // CR LF, too
		String s3 = "the end.";
		System.out.println(s1 + s2 + s3); // 3 lines

		// chars Unicode
		
		System.out.println('\u0007');
/*		System.out.println('\u000D'); // invalid char constant - CR - even in comment like this */
//		System.out.println('\0900'); // ERROR - starts with 0 === oct

		String sChar = String.valueOf('\ucafe'); // \\u === hex
		System.out.println(sChar);
		
		String sChars = new String(new char[] {'q', '\uffff'});
		System.out.println(sChars);
		
		// Special floating values
		
		System.out.println(1 / 0d); // +Infinity
		System.out.println(1 / -0d); // -Infinity
		System.out.println(0 / 0f); // NaN
		
		// float/double precision
		
		double resFloat = 1 / 3f; // result - float
		System.out.println(resFloat);
		double resDouble = 1 / 3d; // result - double
		System.out.println(resDouble);
		System.out.println(resFloat > resDouble);
		
		/*
		 * должно прекрасно уместиться в тип byte, в байтовую переменную.
		 * Но из-за автоматического преобразования типа результата в int мы получаем сообщение
		 * об ошибке от транслятора — ведь при занесении int в byte может произойти потеря точности
		 */
		byte b = 50;
//		b = b * 2;
        // Но так можно:
		b *= 2;

		// type cast
		int a = 2000;
		b = (byte) a;
		System.out.println(b);
		System.out.println((byte) 2000);
		System.out.println((byte) Long.MAX_VALUE);
	}
	
}
