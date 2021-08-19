/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210819.ch12_5;

/**
 *
 * @author xvpow
 */
public class Ch12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Shadow 遮蔽
        //有繼承關係才有遮蔽的可能性
        //會遮蔽的是:屬性 靜態的方法與屬性
        
        //遮蔽看類別
        //複寫看物件
        Test1 t1 = new Test2();
        t1.m1();
        System.out.println(t1.value1);
    }
    
}
