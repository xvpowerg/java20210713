/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_202107227;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {
    // 我的變數 放到一個方法後 是否會改變
    //call by value 一定不會變 所有基本型態
    static void swap(int a,int b){
       int tmp  = a;
        a = b;
        b = tmp;        
    }
        //call by reference 不一定會變 可能會改變
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+":"+b);
        swap(a,b);
//        int tmp  = a;
//        a = b;
//        b = tmp;
        System.out.println(a+":"+b);
                
        
        
    }
    
}
