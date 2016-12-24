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
public class Carrier extends Ship {
    int planes;
    public class TestChild extends TestClass{
        
    }
    
    public class NuclearEngine extends Engine{
        int maxSailDuration;

        public NuclearEngine(int maxSailDuration, int hp, String model, EngineType type) {
            super(hp, model, type);
            this.maxSailDuration = maxSailDuration;
        }
        
    }

    public Carrier(int planes) {
        this.planes = planes;
        this.engine = new NuclearEngine(180, 200_000, "Lokhid Martin", Ship.EngineType.STEAM);
    }
    
}
