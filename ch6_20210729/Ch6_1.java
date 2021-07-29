/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210729;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    /**
     * Overloading
     * 1 找一樣類型
     * 2 找相同類型可相容
     * 3 不同類型可相容
     * 4 轉成封箱類型
     */
    
    static void test1(float v1,int v2){
        System.out.println("test1 float int:"+v1+":"+v2);
    }
    
    static void test1(short v1,int v2){
        System.out.println("test1 short int:"+v1+":"+v2);
    }
    
      
    static void test2(float v1,int v2){
        System.out.println("test2 float int:"+v1+":"+v2);
    }    
    static void test2(short v1,int v2){
        System.out.println("test2 short int:"+v1+":"+v2);
    }
    static void test2(Integer v1,int v2){
        System.out.println("test1 Integer int:"+v1+":"+v2);
    }
       // 一個參數以上時 不可模糊不清   
    static void test3(int v1,float v2,Integer v3){
        System.out.println("int float Integer");
    }
    static void test3(Integer v1,float v2,int v3){
        System.out.println("Integer float int");
    }
    
    public static void main(String[] args) {
        test1(10,25);
        test2(10,25);
        //test3(1,2,3);//模糊不清
        test3(1,2,Integer.valueOf(3));
    }
    
}
