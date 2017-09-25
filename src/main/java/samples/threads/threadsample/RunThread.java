/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package samples.threads.threadsample;


/**
 * @author Admin
 */
class MyRunThread extends Thread {
    volatile private int iterations;

    public MyRunThread(int iterations) {
        this.iterations = iterations;
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            System.out.println("Hello from MyThread " + getName());
            System.out.println("Hello from Thread " + Thread.currentThread().getName());

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                return;
            }
        }

    }
}

public class RunThread {

    public static void main(String args[]) throws InterruptedException {
        final int count[] = {20};

        count[0] = 30;
        count[0] = 35;

        MyRunThread myThread = new MyRunThread(5);

        myThread.run();
        myThread.start();
        myThread.join();

        System.out.println("Main Thread is finished");
    }

}
