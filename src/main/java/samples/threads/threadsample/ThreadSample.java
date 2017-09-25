/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.threads.threadsample;

/**
 * @author sds
 */
class MyThisThread extends Thread {

    public void run() {
        try {
            synchronized (this) {
                System.out.print("Hello ");
                this.wait();
                System.out.print("!");
            }
        } catch (InterruptedException ignored) {
        }
    }

}

public class ThreadSample {

    public static void main(String[] args) throws InterruptedException {
        MyThisThread thread = new MyThisThread();
        thread.start();
        Thread.sleep(1000);
        synchronized (thread) {
            System.out.print("world");
            thread.notify();
            System.out.print("?");
        }
    }

}
