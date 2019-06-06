package block03.inheritance04;

public class Base {
	public int x = 0;
	private float y = initY();
	private static boolean isStatic;

	/**
	 * Constructor
	 */
	protected Base() {
		super(); // Object
	}

	/**
	 * Constructor
	 *
	 * @param x
	 * @param y
	 */
	public Base(int x, float y) {
		System.out.println("Base Constructor started");
		System.out.println("y = " + this.y);
		this.x = x;
		this.y = y;
		System.out.println("Base Constructor finished");
	}

	// Getters & Setters
	
	public float getY() {
		return y;
	}
	
	// init block
	{
		System.out.println("init block before: y = " + y);
		y = 10;
		System.out.println("init block after: y = " + y);
	}
	
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * Hepler method initializes y variable
	 * @return
	 */
	float initY() {
		System.out.println("initializing y = -999...");
		return -999f;
	}
	
	public void run() {
		System.out.println("Base running");
	}

	public void printX() {
		System.out.println(x);
	}
	
	// static method
	public static void staticMethod() {
		System.out.println("I am static method");
//		this.x = 0; // no way!
		isStatic = true; // without this.
	}
	
}
