/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.threads.com.simple;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Денис
 */
public class Producer extends Thread {
    Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        while (!interrupted()) {
            Integer i = new Random().nextInt();
            queue.push(i);
            System.out.println("Produced value: " + i);
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                return;
            }
        }
    }

}
