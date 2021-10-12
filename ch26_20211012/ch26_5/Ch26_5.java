/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20211012.ch26_5;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Random;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author xvpow
 */
public class Ch26_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        Callable<Integer> callable = ()->{
          System.out.println(Thread.currentThread().getName());          
          TimeUnit.SECONDS.sleep(5);
        return ran.nextInt();
        };
        //有固定執行續數量
        ExecutorService es =   Executors.newFixedThreadPool(3);
        Future<Integer> f1 =  es.submit(callable);
        Future<Integer> f2 =  es.submit(callable);
        Future<Integer> f3 =  es.submit(callable);
        Future<Integer> f4 =  es.submit(callable);
        
        Thread th1 = new Thread(()->{
            try{
                System.out.println("F1:"+f1.get());
                System.out.println("F2:"+f2.get());
                System.out.println("F3:"+f3.get());
                System.out.println("F4:"+f4.get());
            }catch(Exception ex){
                
            }
            
        });
        th1.start();
        es.shutdown();
       // es.shutdownNow();
    }
    
}
