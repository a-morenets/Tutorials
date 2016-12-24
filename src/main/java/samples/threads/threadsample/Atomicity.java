/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.threads.threadsample;

/**
 * @author sds
 */
public class Atomicity extends Thread {
    static long i;
    static volatile Object lock = new Object();
    //static ReentrantLock lock = new ReentrantLock();
    boolean b;

    public void run() {
        while (true) {
            // Class clazz = Object.class;
            // Object.class  = String.class;
            // Condition cond = lock.newCondition();
            //cond.
            //
            //          lock.
           /* if(! lock.tryLock() ){
                continue;
            }
            try {
             */
            if (b = !b) {
//                    synchronized(lock){
                i--;
                //                  }
            } else {
                //                synchronized(lock){
                i++;
                //            }
            }
            /*} finally {
                lock.unlock();
            }*/
            //}
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Atomicity().start();
        new Atomicity().start();
        // new Atomicity().start();

        while (true) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}