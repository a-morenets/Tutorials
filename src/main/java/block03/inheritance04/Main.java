package block03.inheritance04;

public class Main {

	public static void main(String[] args) {

		// super() invocation (see subChild and Child classes)
		SubSubClass subChild = new SubSubClass();
		subChild.run(); // Child has no run() method
		System.out.println("-------------------");

		// instance variables overriding
		Base base = new SubClass();
		base.x = 17;
		base.printX(); // 1 --- x from Child class
		System.out.println(base.x); // but now 17 --- from Base class
		System.out.println("-------------------");

		// instanceof
		
		base = new Base();
		System.out.println(base instanceof Base); // true
		System.out.println(base instanceof SubClass); // false
		
		SubClass child = new SubClass();
		System.out.println(child instanceof SubClass); // true
		System.out.println(child instanceof Base); // true
		
		base = new SubClass();
		System.out.println(base instanceof Base); // true
		System.out.println(base instanceof SubClass); // true
		
		System.out.println(subChild instanceof Base); // true
		System.out.println(subChild instanceof SubClass); // true
		System.out.println(subChild instanceof SubSubClass); // true
		
		base = new SubSubClass();
		System.out.println(base instanceof Base); // true
		System.out.println(base instanceof SubClass); // true
		System.out.println(base instanceof SubSubClass); // true
		System.out.println("-------------------");
		
		// init block
		Base superBase = new Base(3, 5);
		System.out.println(superBase.getY());
		System.out.println("-------------------");
	}
	
}
