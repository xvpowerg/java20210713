/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210902.Ch16_3;



/**
 *
 * @author xvpow
 */
public interface TestIF_3 extends TestIF_2,TestIF_1{
    //TestIF_3 defMethod 需要複寫 因為在TestIF_2與TestIF_1都有相同名稱的方法
    //不知道該聽誰的
      default void defMethod(){
        System.out.println("TestIF_3");
    }
}
