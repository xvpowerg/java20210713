/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_4;

/**
 *
 * @author xvpow
 */
public class TestException {
    private static int  age;
    public static void  printAge(){
        System.out.println(age);
    }
    public static void testAge(int inAge){
        if (inAge <= 0 || inAge >= 200){            
            System.out.println("錯誤的年齡");
            //拋出一個錯誤
           throw new RuntimeException("錯誤的年齡!!必須在1~199");
        } 
        age = inAge;
        System.out.println("正確的age:"+inAge);
    }
}
