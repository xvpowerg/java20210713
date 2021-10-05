/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20211005.ch24_6;

/**
 *
 * @author xvpow
 */
public class TestClose2 implements AutoCloseable{
     private boolean throwEx = false;
    TestClose2(){  }
    public TestClose2(boolean throwEx){
        this.throwEx  = throwEx;
    }
    public void close()throws Exception{
        System.out.println("TestClose2");
        if (throwEx) throw new Exception();
    }
}
