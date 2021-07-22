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
public class Ch4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 封箱類型(wrapper) 把基本型態轉為物件
       
        //把25變成一個物件
        //byte   Byte
        //short Short
        //int     Integer
        //long   Long
        //float Float
        //double Double
        //char     Character
        //boolean Boolean
         //boxing 裝箱
        Integer value1 = Integer.valueOf(25);     
        //unboxing 開箱
        int value2 = value1.intValue();        
        System.out.println(value2);
        //自動封箱
        Integer value3 = 56;
        //自動解封箱
        int value4 = value3;
        System.out.println(value3);
         
        Integer value5 = null;
         Integer value6 = 12;        
         System.out.println(value5 + value6);
    }
    
}

