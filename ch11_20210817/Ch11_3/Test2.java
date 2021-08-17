/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210817.Ch11_3;

/**
 *
 * @author xvpow
 */
//每一個建構式 都會呼叫父類別的預設建構式
//super() 呼叫父類建構式
//this()呼叫當前類別的其他建構式
public class Test2 extends Test1{

      public Test2(){
            this("Empty");
             System.out.println("Test2()!!!");
      }
    public  Test2(String msg){
        super(msg);        
        System.out.println("Test2(msg)!!!");
    }
    
    
   public void testX(){
       super.testX();
        System.out.println("Test1");
    }
    
}
