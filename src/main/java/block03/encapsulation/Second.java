package block03.encapsulation;


public class Second extends First {
	int publicValue = 2;
	private int value = 2;

	void addFive() {
		System.out.println("addFive in Second");
		value += 5;
	}

	public int GetValue() {
		System.out.println("getValue in Second");
		return value;
	}

}
