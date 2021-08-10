/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_3;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public int testReturn(int a,int b){
        return a+b;
    }    
     public Test1 testReturnObj(){
         return null;
     }
     
     public void testParameter(Object obj){
         System.out.println("testParameter:"+obj);
     }
}
