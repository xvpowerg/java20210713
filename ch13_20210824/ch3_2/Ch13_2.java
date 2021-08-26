/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210824.ch3_2;

import ch13_20210824.ch3_1.*;

/**
 *
 * @author xvpow
 */
public class Ch13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test2();
        t1.setValue1("Set Value1");//
        System.out.println(t1.value1);//Value1 Test1
        System.out.println(t1.getValue1());//Value1 Test1
        
    }
    
}
