/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210831.ch15_8;

/**
 *
 * @author xvpow
 */
public interface MyIterator {
    boolean hasNext();
    String next();    
    //default 的介面方法可呼叫 介面的抽象方法
     default void foreach(){
         while(hasNext()){
                System.out.println(next());
         }
        }
}
