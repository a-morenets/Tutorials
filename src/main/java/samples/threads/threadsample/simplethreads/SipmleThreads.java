/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.threads.threadsample.simplethreads;


/**
 * @author sds
 */
class MySimpleThread extends Thread {
    Printer printer;

    public MySimpleThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        synchronized (System.out) {
            for (int i = 0; i < 10000; i += 2) {
                synchronized (printer) {
                    printer.print(i);
                }

                Thread.yield();

                if (this.isInterrupted()) {
                    return;
                }
            }
        }
    }

}

class Printer {
    synchronized public void print(int i) {
        System.out.println(i);
    }
}

public class SipmleThreads {
    public static void main(String args[]) throws InterruptedException {
        final Printer printer = new Printer();
        Thread th = new MySimpleThread(printer);

        final Thread my = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (printer) {
                    for (int i = 1; i < 10000; i += 2) {
                        synchronized (System.out) {
                            System.out.println(i);
                        }
                        Thread.yield();
                    }
                }
            }
        });

        th.start();
        my.start();

        my.join();
        th.join();

        System.out.println("thread are finished!");
        th.interrupt();
    }

}
