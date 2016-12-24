/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.threads.threadsample;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Денис
 */
public class Volatile {
    static /*volatile*/ boolean end[] = new boolean[1] ;
    public static void main(String[] args) throws InterruptedException {
        new Thread( 
                () -> { 
                        System.out.println("started");
                          while(
                                 // !end[ (int)(Math.random()*end.length) ]
                                  !end[0]
                                  ){ 
                          } 
                        System.out.println("finished"); 
                      }
        ).start();
        Thread.sleep(1000);
        //Arrays.fill(end, 0, end.length, true);
        end[0] = true;
        
    }
    
}
