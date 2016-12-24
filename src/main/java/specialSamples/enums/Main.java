package specialSamples.enums;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pixel pixel1 = new Pixel(2,2, Color.RED);
        System.out.println(pixel1.getColor());
        System.out.println("==============================");
        for(Color color: Color.values()){
            System.out.println(color);
        }
        System.out.println("==============================");
        System.out.println(Planet.JUPITER.name());
        System.out.println(Planet.JUPITER.mass());
        System.out.println(Planet.JUPITER.radius());
        System.out.println(Planet.JUPITER);
        System.out.println(Planet.JUPITER.surfaceGravity());
        System.out.println("==============================");
        for(Planet planet: Planet.values()){
            System.out.println(planet);
        }
        System.out.println("==============================");
        for(Planet planet: Planet.values()){
            System.out.println(planet.name() + " " + planet.mass());
        }
    }
}
