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
public class Ch5_8 {

    /**
     * Overloading
     * 1 找一樣類型
     * 2 找相同類型可相容
     * 3 不同類型可相容
     * 4 轉成封箱類型
     */
    static void test1(int value){
        System.out.println("Test1 int:"+value);
    }
    static void test1(float value){
        System.out.println("Test1 float:"+value);
    }
    
    static void test2(short s1){
        System.out.println("Test2 short:"+s1);
    }
    static void test2(int v2){
        System.out.println("Test2 int:"+v2);
    }
    static void test2(long v3){
        System.out.println("Test2 long:"+v3);
    }
   static void test2(float v4){
        System.out.println("Test2 float:"+v4);
    }
   
    static void test3(String v1){
        System.out.println("Test3 String:"+v1);
    }
    static void test3(float v1){
        System.out.println("Test3 float:"+v1);
    }
    
    static void test4(String v1){
         System.out.println("test4 String:"+v1);
    }
     static void test4(Integer v2){
         System.out.println("test4 Integer:"+v2);
    }     
     static void test5(String v1){
         System.out.println("test5 String:"+v1);
    }
     //Float 不相容 Integer
     static void test5(Float v2){
         System.out.println("test5 Float:"+v2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        test1(20);
        byte b1 = 15;
        test2(b1);
        test3(35);
        
        test4(20);
        //test5(20);
    }
    
}
