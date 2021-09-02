/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210902.Ch16_4;

/**
 *
 * @author xvpow
 */
public class Ch16_4 {
    
    public static void main(String[] args) {
     
        MyClass testMyclss = new MyClass();
        //因為沒繼承到所以無法呼叫
        //testMyclss.staticMethod();
        TestIF_1.staticMethod();
        TestIF_2.staticMethod();
        
    }
    
}
