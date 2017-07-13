package specialSamples.nested_inner_local_anonymous.model;

/**
 * Created by Администратор on 01.02.2016.
 */
public class Car extends Vehicle {
    private String model;
    private String color;
    private String vin;

    private Charger charger;
    private BodyType bodyType;

    public enum  BodyType {
    	SEDAN , UNIVERSAL
    }

    public enum FuelType{
        GASOLINE , DIESEL, LPG , ELECTRO
    }

    public class Engine extends AbstractEngine {
        /**
         * in cc
         */
        private String model;
        private int hp;
        FuelType fuelType;


        public Engine(int hp, FuelType fuelType) {
            this.hp = hp;
            this.fuelType = fuelType;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "hp=" + hp +
                    ", fuelType=" + fuelType +
                    " of car " + Car.this.model +
                    '}';
        }
    }

    public static class Charger extends AbstractCharger {
        private String model;
        private int chargeCurrent;
        private Car thisCar;


        public Charger(String model, int chargeCurrent, Car thisCar) {
            this.model = model;
            this.chargeCurrent = chargeCurrent;
            this.thisCar = thisCar;
        }

        @Override
        public String toString() {
            return "Charger{" +
                    "model='" + model + '\'' +
                    ", chargeCurrent=" + chargeCurrent +
                    " of car " + thisCar.model +
                    '}';
        }
    }

    public Car(String model, String color, String vin, Charger charger, BodyType bodyType) {
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.charger = charger;
        this.bodyType = bodyType;
        this.charger.thisCar = this;
        this.engine = new Engine( 200 , FuelType.DIESEL);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", vin='" + vin + '\'' +
                ", engine=" + engine +
                ", charger=" + charger +
                ", bodyType=" + bodyType +
                '}';
    }
}
