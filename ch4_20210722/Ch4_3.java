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
public class Ch4_3 {
   static  void test1(int x){
        int v1 = 0;
        v1++;
        test2(x+1);
        v1++;
        System.out.println("test1");
        System.out.println("x:"+x);
        System.out.println("v1:"+v1);
    }
    
   static  void test2(int y){
        test3(y+1);
        System.out.println("Test2");
        System.out.println(y);
    }
    
   static  void test3(int z){
        System.out.println("Test3");
          System.out.println(z);
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      test1(1);
    }
    
}
