package block03.inheritance01;


public class Child extends Parent {
	int x = 3;

	void print(int x) {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

	public void printChildX() {
		System.out.println(x);
	}

	public static void main(String s[]) {
		new Child().print(0); // prints 0 3 2
		System.out.println("-------------------------");
		
		new Child().print(); // prints 2 (because Child class does not have print() method)
		System.out.println("-------------------------");

		new Child().printChildX(); // prints 3 (because Child class does have printChildX() method)
	}

}
