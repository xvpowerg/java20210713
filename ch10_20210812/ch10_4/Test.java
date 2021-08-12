/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210812.ch10_4;

/**
 *
 * @author xvpow
 */
public class Test {
    private String name;
   Test(String name){
       this.name = name;
   }
   
   public void print(boolean b){
       if (b) throw new RuntimeException("Test Exception!");
       System.out.println("name:"+name);
   }
    public  void close(){
        System.out.println("close"+name);
    }
}
