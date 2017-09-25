/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.threads.threadsample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author sds
 */
public class ThreadPriority extends Thread {

    public void run() {
        while (!isInterrupted()) {
            System.out.println("1");
        }
    }

    public static void main(String args[]) {
        final Thread thrd = new ThreadPriority();

        thrd.start();

        new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                System.out.println("2");
            }
            thrd.interrupt();
        }).start();

        try {
            thrd.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadPriority.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("main is finished");
    }

}
