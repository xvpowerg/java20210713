/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210824.ch3_5;

//抽象類別的思維 
//1 這個類別不可建立實體(不可new)
//2 有部分方法提醒開發人複寫
public abstract class Fruit {
    private String name;
    private int price;
    Fruit(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String toString(){
        return name+":"+price;
    }
}
