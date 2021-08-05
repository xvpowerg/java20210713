/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210805.Ch8_2;

/**
 *
 * @author xvpow
 */
public class Ch8_2 {
      public static void main(String[] args) {
          //當沒有任何建構式時會自動建立預設建構式
          //每一組建構式預設都會呼叫父類別的預設建構式 
          //  除非手動呼叫super(xx參數)或this(xxx參數)
          
          Test1 t2 = new Test2();
      }
}
