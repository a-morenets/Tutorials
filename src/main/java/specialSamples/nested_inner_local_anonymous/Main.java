package specialSamples.nested_inner_local_anonymous;

import specialSamples.nested_inner_local_anonymous.model.Car;
import specialSamples.nested_inner_local_anonymous.model.ElectroCar;

public class Main {

    public static void main(String[] args) {

        // Charger is a static inner class
        Car.Charger charger = new Car.Charger("XXXCharger", 20, null);

        // null for car instance - ???
        Car car = new Car("bmw", "black", "100500AA", charger, Car.BodyType.SEDAN);

        // Engine is non-static inner class
        Car.Engine engine = car.new Engine(250, Car.FuelType.GASOLINE);

        car.setEngine(engine);
        System.out.println(car);
        
        Car tesla = new ElectroCar("tesla", "white", "50001", charger, Car.BodyType.SEDAN, 500);
        System.out.println(tesla);
    }
}