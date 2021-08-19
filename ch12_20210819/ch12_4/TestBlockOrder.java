/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210819.ch12_4;

/**
 *
 * @author xvpow
 */
public class TestBlockOrder {
    {
      System.out.println("No Static!!1");
    }
    static{
      System.out.println("Static!!1");
    }
    TestBlockOrder(){
           System.out.println("TestBlockOrder()");
    }
    
    {
      System.out.println("No Static!!2");
    }
    
      static{
      System.out.println("Static!!2");
    }
}
