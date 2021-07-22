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
public class Ch4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println(Integer.MAX_VALUE);
     System.out.println(Integer.MIN_VALUE);
     //10進位轉二進位
     String bStr = Integer.toBinaryString(123);
     System.out.println(bStr);
      //10進位轉8進位
     String octStr = Integer.toOctalString(123);
     System.out.println(octStr);
     //10進位轉16進位
      String hexStr = Integer.toHexString(123);
     System.out.println(hexStr);
     
     
     
    }
    
}
