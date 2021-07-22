/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210722;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {
   static  void test1(){
         test2();
        System.out.println("Test1");
    }
    
   static  void test2(){
        test3();
        System.out.println("Test2");
    }
    
   static  void test3(){
        System.out.println("Test3");
    }
    public static void main(String[] args) {
        test1();
    }
    
}
