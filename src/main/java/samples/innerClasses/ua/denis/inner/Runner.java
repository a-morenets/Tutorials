/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.innerClasses.ua.denis.inner;

/**
 *
 * @author Денис
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ship ship = new Ship("Titanic" , 70000);
        Ship.Boat boat = new Ship.Boat(ship, 200);
        ship.setBoat(boat);
        Ship.Engine engine = ship.new Engine(30000,"RR", Ship.EngineType.STEAM);
        ship.setEngine(engine);
        System.out.println(ship);
        
        ship = new Ship();
        System.out.println(ship);
        
        ship = new Carrier(60);
        System.out.println(ship);
    }
    
}
