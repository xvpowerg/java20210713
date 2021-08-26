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
//因為類別有抽象方法所以類別必須抽象
public abstract class Animal {
    private String name;
    private float height;
    
    public Animal(String name,float height){
        this.name = name;
        this.height = height;
    }
    //抽象方法
    //記得要複寫的方法
    //因為是抽象方法 不可final與private
    public abstract void bark();
    public String toString(){
        return name+":"+height;
    }
            
}
