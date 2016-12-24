/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.streams.samples.streamsamples;

import samples.streams.samples.config.Config;
import samples.streams.samples.entities.CoffeeMachine;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *
 * @author Денис
 */
public class StreamSamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Config config = Config.getInstance();
        System.out.println(config.getFileName());
        
        CoffeeMachine machine = new CoffeeMachine("coffee", 50);
        machine.components.add(machine.new Component("sugar", 20));
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream objOs = new ObjectOutputStream( bos);
        objOs.writeObject(machine);
        
        for( byte  b: bos.toByteArray() ){
            System.out.write(b);
        }
        
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);
        pos.write(bos.toByteArray());
        inputController(pis);
        
    }

    private static void inputController(InputStream is) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(is);
        CoffeeMachine machine = (CoffeeMachine) ois.readObject();
        System.out.println("\n"+machine);
    }
}
