/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210722;

/**
 *
 * @author xvpow
 */
public class Ch4_1 {
    //是否有回傳值 void無回傳
    // 函數名稱
    //()傳入參數
   //{} 我要執行的功能
    static void test1(){
        System.out.println("Test!!");
    }
    static int add(int a,int b){
        int ans = a + b;
        //return 離開函數 
        return ans;
    }
    
    //靜態只能呼叫靜態的
    public static void main(String[] args) {       
        test1();
        int value1 = add(15,12);
        System.out.println(value1);
    }
    
}
