/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210902.Ch16_1;

/**
 *
 * @author xvpow
 */
public class Item implements MyComparator {
    private int value;
    public Item(int value){
        this.value = value;
    }
    
    public int getItem(){
        return value;
    }
    public String toString(){
        return "Item:"+value;
    }
    public int compara(int v1){
            //只要this的數值 小於 目前回傳負數
            //只要this的數值 大於 目前回傳正數
            //只要this的數值 等於 目前回傳0
            if (this.getItem() > v1){
                 return  1;
            }else if (this.getItem() < v1){
                return  -1;
            }
            return 0;
      }
    
}
