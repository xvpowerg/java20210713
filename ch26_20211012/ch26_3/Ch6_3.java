/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20211012.ch26_3;

/**
 *
 * @author xvpow
 */
public class Ch6_3 {

    static class TestDeadLock{
     public synchronized void test1(TestDeadLock dlock){
         System.out.println("Test1:"+Thread.currentThread().getName());
            dlock.test2();
     }
     public synchronized void test2(){
         System.out.println("Test2:"+Thread.currentThread().getName());
     }
    }
    
    
    public static void main(String[] args) {
       TestDeadLock td1  = new  TestDeadLock();
       TestDeadLock td2  = new  TestDeadLock();
       Thread t1  = new Thread(()->{
              td1.test1(td2);
       });
       Thread t2  = new Thread(()->{
              td2.test1(td1);
       });
       t1.start();
       t2.start();
       
        
        
    }
    
}
