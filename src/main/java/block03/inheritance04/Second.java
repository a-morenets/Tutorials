package block03.inheritance04;


public class Second extends First {
	int val = 2;
	private int value = 2;

	void addFive() {
		value += 5;
		System.out.println("second ");
	}

	public int GetValue() {
		return value;
	}

}
