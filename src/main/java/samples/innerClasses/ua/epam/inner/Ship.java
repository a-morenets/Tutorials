/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.innerClasses.ua.epam.inner;

/**
 *
 * @author Денис
 */
public class Ship {
    private String name;
    private int tonnage;
    private Boat boat;
    protected Engine engine;

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public Ship(String name, int tonnage) {
        this.name = name;
        this.tonnage = tonnage;
    }

    public Ship() {
        name = "Britanic";
        tonnage = 70000;
        boat = new Boat(this ,200);
        engine = new Engine(50000, "RR", EngineType.STEAM);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Ship{" + "name=" + name + ", tonnage=" + tonnage +
                ", boat=" + boat  +" engine " + engine +'}';
    }
    
    
    
    public /*private*/ static class Boat{
        private int capacity;
        private Ship ship;

        public Boat(Ship ship ,int capacity) {
            this.capacity = capacity;
            this.ship = ship;
        }

        @Override
        public String toString() {
            
            return "Boat{" + "capacity=" + capacity +  "of ship" + ship.name  +'}';
        }
        
        
    }
    
    public class Engine{
        private int hp;
        private String model;
        private EngineType type ;

        public Engine(int hp, String model, EngineType type) {
            this.hp = hp;
            this.model = model;
            this.type = type;
        }
        //String name;
        @Override
        public String toString() {
            return "Engine{" + "hp=" + hp + ", model=" + model 
                    + ", type=" + type + " of ship " + Ship.this.name + '}';
            
        }
        
        
        
    }
    public enum EngineType{
            DIESEL, STEAM, TURBINE 
    }
}
