/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_1;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {
//複寫規則
    //1 讀取權限只能開放不能封閉
    //2 回傳值如果是基本型態必須一樣
    //3 回傳值如果是物件類型型態必須可以是子類一樣
    //4 方法名稱傳入參數必須一樣
    //5 例外拋出可以拋出一樣 或子類 或不拋出
    
    //讀取權限
    //public 跨package可讀取
    //protected 跨package不可讀取除非繼承
    //default(預設情況)跨package不可讀取
    //private 只有在相同類別內讀取
    public static void main(String[] args) {
            Test1 t1 = new Test1();
            System.out.println(t1.publicVar);
            System.out.println(t1.protectedVar);
            System.out.println(t1.defaultVar);
     
            t1.publicMethod();
            t1.protectedMethod();
            t1.defaultMethod();
    }
    
}
