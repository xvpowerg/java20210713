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
public class Ch12_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //靜態的static區塊只會執行一次
        //非靜態的區塊 會看new幾次執行幾次
        //順序 靜態 非靜態 建構式
        TestBlockOrder tbo1 = new TestBlockOrder();
       TestBlockOrder tbo2 = new TestBlockOrder();
    }
    
}
