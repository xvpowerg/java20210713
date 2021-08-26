/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210824.ch13_6;

/**
 *
 * @author xvpow
 */
// 因為Animal 有抽象的方法 所以Dog必須解決抽象問題 方式有2
//1 Dog也變抽象
//2 複寫抽象方法
public  class Dog extends Animal{
    Dog(String name,float height){
        super("Dog:"+name,height);
    }
     public void bark(){
         System.out.println("喵喵!!");
     }
}
