/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210902.Ch16_4;

import ch16_20210902.Ch16_3.*;



/**
 *
 * @author xvpow
 */
public interface TestIF_3 extends TestIF_2,TestIF_1{
  //因為static方法不會被繼承 所以不會出錯
}
