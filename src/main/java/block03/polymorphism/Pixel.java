package block03.polymorphism;

import java.awt.Color;

public class Pixel extends Point {
	Color color;

	public void clear() {
		System.out.println("Pixel clear");
		super.clear();
		color = null;
	}

}
