/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.threads.threadsample;

/**
 *
 * @author sds
 */
class Incrementor extends Thread {
    @Override
    public void run(){
        for( int i = 0; i<10000000; i++){
         synchronized(AtomicityPrint.lock){
         //   AtomicityPrint.re.lock();
                  //int temp = AtomicityPrint.value.get();
                 
                  //AtomicityPrint.value.compareAndSet(temp, temp+1);
                AtomicityPrint.value++;
               // if( AtomicityPrint.value %2 == 0){
             //       AtomicityPrint.lock.notify();
               // }
        //    AtomicityPrint.re.unlock();
         }
        }
    }
}
public class AtomicityPrint {
    
    static volatile int value;
    //static volatile AtomicInteger value = new AtomicInteger();
    static volatile Object lock = new Object();
   // static ReentrantLock re = new ReentrantLock();
    
    public static void main( String args[]) throws InterruptedException{
     //   lock.notify();
        new Incrementor().start();
       // new Incrementor().start();
        while (value<10000000){
            //int temp ; 
           if( value%2==0){
           synchronized( lock ){
            
           // re.lock();
           if(value%2==0){
                
                System.out.println("value="+value);
          //  }else{
            //   lock.wait();
           }
          // re.unlock();
          }
         }else{
            Thread.yield();
          }
        }
    }
}
