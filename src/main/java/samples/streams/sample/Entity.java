/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.streams.sample;

import java.io.Serializable;

/**
 *
 * @author Денис
 */
public class Entity implements Serializable{
    String name;
    int id;

    private Entity(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    private static Entity instance;
    
    private static int counter = 0 ;
    
    public static Entity getInstance(){
        if( instance == null){
            instance = new Entity("string", ++counter );
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Entity{" + "name=" + name + ", id=" + id + '}';
    }
    
    
 }
