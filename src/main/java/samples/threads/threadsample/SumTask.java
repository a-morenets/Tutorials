/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package samples.threads.threadsample;

import java.util.Arrays;

/**
 * @author Admin
 */
class SumCalculator extends Thread {
    int arr[];
    static volatile long res;
    int begin;
    int end;

    public SumCalculator(int[] arr, int begin, int end) {
        this.arr = arr;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = begin; i < end; i++) {
            synchronized (SumCalculator.class) {
                res += /*Math.exp( Math.sin(*/ arr[i]/* ))*/;
            }
        }
    }

    public long getRes() {
        return res;
    }

}

public class SumTask {

    public static void main(String args[]) throws InterruptedException {
        int arr[] = new int[40_000_000];
        Arrays.fill(arr, 1);
        int threadNumber = 256;
        SumCalculator[] sc = new SumCalculator[threadNumber];
        for (int i = 0; i < threadNumber; i++) {
            sc[i] = new SumCalculator(arr, arr.length / threadNumber * i,
                    arr.length / threadNumber * (i + 1));
            sc[i].start();
        }
        //sc1.start();
        // sc2.start();
        int total = 0;
        Thread.sleep(25);
        for (SumCalculator th : sc) {
            th.join();
            // total += th.getRes();
        }
        System.out.println(SumCalculator.res);//total);
        //sc1.join();
        //sc2.join();
        //int res = 0;
        //for(int i=0; i<arr.length/2; i++){
        //    res+=arr[i];
        //}
        //
//        int i = 0;
//        for(;true;){
//            i++;
//            if(false){
//                break;
//            }
//        }
        // System.out.println(sc1.getRes() + sc2.getRes() );
    }

}
