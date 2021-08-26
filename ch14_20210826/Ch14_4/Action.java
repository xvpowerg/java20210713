/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210826.Ch14_4;

/**
 *
 * @author xvpow
 */
//介面的抽象方法只有一個可稱為FunctionalInterface

//@FunctionalInterface 檢查是否為正確的FunctionalInterface
//FunctionalInterface 是用來模擬方法的
@FunctionalInterface
public interface Action {
    public void run();        
}
