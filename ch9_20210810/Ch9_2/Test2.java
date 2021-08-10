/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_2;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    //public 複寫
     @Override 
    public void publicMethod(){
        System.out.println("Test2 publicMethod!!");
    }
    //public protected 複寫
     @Override 
   public void protectedMethod(){
        System.out.println("Test2 protectedMethod");
    }
   //public protected default 複寫
    @Override 
   void defaultMethod(){
        System.out.println("Test2 defaultMethod");
   }
   // 不能是複寫是新增方法  因為private方法子類別看不到   
   void privateMethod(){
        System.out.println("Test2 privateMethod");
     }
}
