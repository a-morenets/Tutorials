package misc;

import java.util.Random;

import block01.Lect02;

public class MyClass {

	static boolean f1(boolean c) {
		System.out.println("f1");
		return c;
	}
	
	static boolean f2(boolean c) {
		System.out.println("f2");
		return c;
	}
	
	public static void main(String[] args) {
		int _ = 0; // yeah, this is a variable )))
		float __ = 3; // variable, too
		double ___ = _ + __; // cool, ain't it?
		System.out.println(___);
		
		byte b = 127;
		short sh = b;
		int i = sh;
		long lo = i;
		float f = lo;
		double d = f;
		
		System.out.println(b);
		System.out.println(sh);
		System.out.println(i);
		System.out.println(lo);
		System.out.println(f);
		System.out.println(d);
		
		f = (float) Double.MAX_VALUE;
		System.out.println(f);
		
		//----------------------------------
		System.out.println("true && true");
		if (f1(true) && f2(true));
		System.out.println("true && false");
		if (f1(true) && f2(false));
		System.out.println("false && true");
		if (f1(false) && f2(true));
		
		System.out.println("true & true");
		if (f1(true) & f2(true));
		System.out.println("true & false");
		if (f1(true) & f2(false));
		System.out.println("false & true");
		if (f1(false) & f2(true));

		System.out.println("true || true");
		if (f1(true) || f2(true));
		System.out.println("true || false");
		if (f1(true) || f2(false));
		System.out.println("false || true");
		if (f1(false) || f2(true));
		
		System.out.println("true | true");
		if (f1(true) | f2(true));
		System.out.println("true | false");
		if (f1(true) | f2(false));
		System.out.println("false | true");
		if (f1(false) | f2(true));

		// invoke main() from other class
		Lect02.main(null);
		
		System.out.println("------------------");
		String s = "abc";
		System.out.println(s);
		System.out.println(s.length());
		int len = s.length();
		
//		byte[] byteArrInt = new byte[Integer.MAX_VALUE]; // OutOfMemoryError may occur!
//		byte[] byteArrLong = new byte[Long.MAX_VALUE]; // cast needed!
		System.out.println("------------------");

		Random rnd = new Random(123456789);
		for (int j = 0; j < 10; j++) {
			System.out.print(rnd.nextInt(100) + " ");
		}
		System.out.println();
		System.out.println("------------------");

		rnd = new Random(123456789);
		for (int j = 0; j < 10; j++) {
			System.out.print(rnd.nextInt(100) + " ");
		}
		System.out.println();
	}
	
}
