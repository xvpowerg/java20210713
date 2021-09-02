/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210902.Ch16_1;

import java.util.stream.Stream;

/**
 *
 * @author xvpow
 */
public interface MyComparator {
            //只要this的數值 小於 目前回傳負數
            //只要this的數值 大於 目前回傳正數
            //只要this的數值 等於 目前回傳0
    int compara(int v1);
    //static 的介面方法不會被繼承
      static Object max(MyComparator[] values){
        MyComparator maxItem = values[0];        
        for(MyComparator it:values){
                Item item = (Item)it;
                if (maxItem.compara(item.getItem()) < 0){
                    maxItem = (MyComparator)item;
                }
        }
        return maxItem;
    }
}
