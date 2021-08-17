/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210817.Ch11_1;

/**
 *
 * @author xvpow
 */
//父類
public class TestOverride {
    public void testExFunc(boolean thex)throws TestException{
        System.out.println("TestOverride!!");
        if (thex){
            throw new TestException("TestException 測試!!");
        }        
    }
    
    public void testRunttimeExceptionFunc()throws TestRuntimeException{
        
    }
    
}
