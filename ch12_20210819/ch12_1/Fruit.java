/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210819.ch12_1;

/**
 *
 * @author xvpow
 */
public class Fruit {
    private String name;
    private int price;
    public Fruit(String name,int price){
        this.name = name;
        this.price = price;
    }
            
    public String toString(){
        return name+":"+price;
    }

    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Fruit)) return false;
        if (obj == this) return true;//傳入的obj與目前的物件使用的記憶體空間相同
        Fruit fruit = (Fruit)obj;
        return  this.price == fruit.price 
                &&  this.name.equals(fruit.name);
    }
}
