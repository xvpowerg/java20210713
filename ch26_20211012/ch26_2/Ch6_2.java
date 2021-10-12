/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20211012.ch26_2;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {
    private static class Test1{
        //資源搶占問題
          private int x;
        public void add(){
                 System.out.println("Thread Start:"+Thread.currentThread().getName());
                  synchronized(this){
                        for (int i =1;i<=5;i++){
                            System.out.println("Thread Loop Start:"+Thread.currentThread().getName());
                            x++;
                            System.out.println(x+":V "+Thread.currentThread().getName());
                            System.out.println("Thread Loop End:"+Thread.currentThread().getName());
                        }
                  }  
                  System.out.println("Thread End:"+Thread.currentThread().getName());
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1();
        Thread th1 = new Thread(()->{t1.add();},"Th1");
        Thread th2 = new Thread(()->{t1.add();},"Th2");
        
        th1.start();
        th2.start();
    }
    
}
