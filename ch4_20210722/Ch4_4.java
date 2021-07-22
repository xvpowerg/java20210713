/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210722;

import java.math.BigInteger;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {
     
       //遞迴Recursion
      static void test(int v){
          //結束函數
          if (v > 5) return;
          System.out.println(v);
          test(v + 1);
          System.out.println(v);  
      } 
    public static void main(String[] args) {
        test(1);
    }
    
}
