/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20211012.ch26_1;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author xvpow
 */
public class Ch26_1 {

    public static void main(String[] args) {
        //印出執行續的名稱
        String mainName = Thread.currentThread().getName();
        System.out.println(mainName);
        
        Thread th1 = new Thread(()->{
            String newThreadName = Thread.currentThread().getName();
            System.out.println(newThreadName);
        },"MyThread!!");
        th1.start();
        
        
        Thread th2 = new Thread(()->{
                for (int i = 5; i >= 0;i--){
                    System.out.println(i);
                    try{
                        TimeUnit.SECONDS.sleep(1);
                    }catch(InterruptedException ex){
                        
                    }                    
                }        
        });
        th2.start();
        
    }
    
}

