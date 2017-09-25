/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.threads.threadsample;


class InterruptedThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10050000; j++)
                if (isInterrupted()) { // interrupted();
                    System.out.println("isInterrupted() == " + isInterrupted());
                    //resources must be closed
                    return;
                }
            System.out.println("Thread is running");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println("InterruptedException");
                //resources must be closed
                return;
            }
        }
    }

}

public class InterruptSample {

    public static void main(String args[]) throws InterruptedException {
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(200);
        thread.interrupt();
    }

}
