package samples.threads;

import java.util.concurrent.ExecutorService;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Денис
 */
public class FutureCallable {
    public static void main(String[] args) throws Exception {
        int nThreads = 10; 
        Function<Runnable,Thread> prod = Thread::new ;
    	ExecutorService ex = Executors.newFixedThreadPool(nThreads , 
                //(r)-> Thread::new. (r)//new Thread(r){
                (r)->prod.apply(r)
                //{ setDaemon(true); }
                        //}
                );
                
    	List<Future<Long[]>> results = new ArrayList<>();
    	  	
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Введите положительное числo n : ");
            final int n = new Random().nextInt(10);
            //ex.su
            Future<Long[]> future = ex.submit( 
            	()-> new Long[]{  
                    Factorial.calcFactorial(n) 
                        , Long.valueOf(n) }	);
            results.add(future);
           
        }
        
        for(Future<Long[]> future: results){
        	Long[] result = future.get();
        	System.out.println("Факториал числа " + result[1] + " = " + result[0]);
        	//System.out.println();	
        	
        }
        ex.shutdown();
    }
    private static class Factorial extends Thread {
     
        private static long calcFactorial (int n) throws InterruptedException {
            long result = 1L;
            for (int i = 2; i <= n; i++) {
                result *= i;
                Thread.sleep(10);
            }
            return result;
        }
    }
}
