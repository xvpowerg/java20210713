/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210812.ch10_1;

/**
 *
 * @author xvpow
 */
public class TestException {
        //checked exceptions
        public void testCatchException(boolean b1)throws Exception{
            System.out.println("TestCatchException 1");
            if (b1){
                //因為這是錯誤的發生地 所以選擇拋出例外(throws Exception)
                throw new Exception("Test Catched Exceotion");              
            }
            System.out.println("TestCatchException 2");
        }
        //unchecked 
        public void testUncheckedException(boolean b1){         
            System.out.println("testUncheckedException 1");
            if (b1){
                throw new ArithmeticException("算術錯誤!!");
            }
            System.out.println("testUncheckedException 2");
        }
}
