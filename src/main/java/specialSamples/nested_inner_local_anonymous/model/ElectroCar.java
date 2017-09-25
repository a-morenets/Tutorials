package specialSamples.nested_inner_local_anonymous.model;

/**
 * Created by Администратор on 01.02.2016.
 */
public class ElectroCar extends Car {

    public class ElectricEngine extends Engine {
        public ElectricEngine(int hp) {
            super(hp, FuelType.ELECTRO);
        }
    }

    public ElectroCar(String model, String color, String vin, Charger charger, BodyType bodyType, int hp) {
        super(model, color, vin, charger, bodyType);
        this.setEngine(new ElectricEngine(hp));
    }

    @Override
    public String toString() {
        return "ElectroCar{" + super.toString() + "}";
    }
}
