/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.streams.samples.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Денис
 */
public class CoffeeMachine implements Serializable{
    String name;
    int waterAmount;
    public List<Component> components = new ArrayList<>();

    public CoffeeMachine(String name, int waterAmount) {
        this.name = name;
        this.waterAmount = waterAmount;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" + "name=" + name + ", waterAmount=" + waterAmount + ", components=" + components + '}';
    }
    
    
    
    public class Component implements Serializable{
        String name;
        int col;

        public Component(String name, int col) {
            this.name = name;
            this.col = col;
        }

        @Override
        public String toString() {
            return "Component{" + "name=" + name + ", col=" + col + '}';
        }
        
        
    }
    
    
}
