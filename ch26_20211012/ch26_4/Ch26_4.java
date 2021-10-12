/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20211012.ch26_4;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Ch26_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(()->{
            for (int i = 1;i<=5;i++){
                System.out.println("Thread Name:"+Thread.currentThread().getName()+":"+i);
                try{
                  Thread.sleep(1000);  
                }catch(Exception ex){}                
            }       
        });
        es.shutdownNow();
    }
    
}
