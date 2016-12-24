package block01;


public class Lect03 extends Lect02 {

	public static void main(String[] args) {
		// ++, --
		int x = 1, y, z;
		y = ++x;
		z = x++;
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
		
		x = 0;
		System.out.println(x++ + ++x - x--); // 0
		System.out.println(x); // 1

		// ~
		int t = 15;
		int s;
		s = ~t; // s = -16
		System.out.println(Integer.toBinaryString(t));
		System.out.println(Integer.toBinaryString(s));
	}

}
