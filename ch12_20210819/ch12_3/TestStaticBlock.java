/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210819.ch12_3;

/**
 *
 * @author xvpow
 */
public class TestStaticBlock {
    static String[] data = new String[10000];
    static{
         for (int i = 0;i<data.length;i++){
             data[i] = "";
         }
    }
    public static boolean test(String testValue){                  
        for (String s : data){
           if (s.equals(testValue)){
               return true;
           }
       }
       return false;
    }
    
    
}
