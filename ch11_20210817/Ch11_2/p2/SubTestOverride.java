/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210817.Ch11_2.p2;
import ch11_20210817.Ch11_2.TestOverride;
/**
 *
 * @author xvpow
 */
public class SubTestOverride extends TestOverride {
 //只有2複寫
    public void test1(){
        System.out.println("SubTestOverride test1!!");
    }

   protected void test2(){
        System.out.println("SubTestOverride test2!!");
    }

     void test3(){
        System.out.println("SubTestOverride test3!!");
    }
}
