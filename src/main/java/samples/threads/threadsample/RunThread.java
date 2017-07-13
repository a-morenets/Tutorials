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

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public MyRunThread(int iterations) {
        this.iterations = iterations;
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            System.out.println("Hello from MyThread " + getName());
            System.out.println("Hello from MyThread " + Thread.currentThread().getName());


            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                return;
            }
        }

    }
}

class RunnableThread implements Runnable {

    //  public RunnableThread(int value) {
    //   }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from RunnableThread");

            //try{

            Thread.yield();
            // }catch(InterruptedException ex){
            //     return;
            // }
        }
    }

}

public class RunThread {
    public static void main(String args[]) throws InterruptedException {

        final int count[] = {20};
        final int size = 20;

        Thread temp = new Thread() {
            private int countSynonim[] = count;

            public void run() {
                for (int i = 0; i < count[0]; i++) {
                    System.out.println("Hello from thread" + i);
//                    try{
//                        Thread.sleep(100);
//                    }catch(InterruptedException ex){
//                        return;
//                    }
                }
            }
        };
        count[0] = 30;
        // temp.start();
        count[0] = 35;
        //size = 100500;
        //temp.join();

        MyRunThread myThread = new MyRunThread(5);
//       myThread.setIterations(51);
        myThread.run();
        myThread.start();
//        //myThread.sleep(10);
//       // myThread.setIterations(10);
//       // myThread.run();
        myThread.join();
//        
//        System.out.println("Hello from main thread" + Thread.currentThread().getName());
//        
        Thread runThread = new Thread(new RunnableThread());
        //runThread.getState()
        //runThread.run();

//        runThread.start();
//
//
//       // runThread.join();
//       // myThread.join();
//      //  temp.join();
//        System.out.println(myThread.getIterations());
        System.out.println("Main Thread is finished");
        //new Callable()
    }

}
